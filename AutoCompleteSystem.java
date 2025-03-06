import java.util.*;

class AutoCompleteSystem {
    class TrieNode{
        Map<Character,TrieNode> children;
        Set<String> sentences;

        TrieNode(){
            children = new HashMap<>();
            sentences = new HashSet<>();
        }
    }

    private TrieNode root;
    private Map <String,Integer> sentenceFrequency;
    private StringBuilder currentInput;
    private TrieNode currentNode;

    public AutoCompleteSystem(String[] sentences,int[] times){
        root = new TrieNode();
        sentenceFrequency = new HashMap<>();
        currentInput = new StringBuilder();
        currentNode = root;

        for(int i = 0;i<sentences.length;i++){
            addSentence(sentences[i],times[i]);
        }
    }

    private void addSentence(String sentence,int times){
        sentenceFrequency.put(sentence,sentenceFrequency.getOrDefault(sentence,0)+times);
        TrieNode node = root;

        for(char c:sentence.toCharArray()){
            node.children.putIfAbsent(c,new TrieNode());
            node = node.children.get(c);
            node.sentences.add(sentence);
        }
    }

    public List<String> input(char c ){
        if(c == '#'){
            //store input sentences in history
            String sentence = currentInput.toString();
            addSentence(sentence,1);
            currentInput.setLength(0); //clear the input
            currentNode = root; //reset pointer
            return new ArrayList<>();
        }

        currentInput.append(c);

        if (currentNode!= null && currentNode.children.containsKey(c)){
            currentNode = currentNode.children.get(c);
        }
        else{
            currentNode = null;
            return new ArrayList<>();
        }

        return getTop3Sentences(currentNode.sentences);
    }

    private List<String> getTop3Sentences(Set<String> candidates){
        List<String> result = new ArrayList<>(candidates);

        result.sort((a,b)->{
            int freqCompare = sentenceFrequency.get(b)- sentenceFrequency.get(a);
            return freqCompare != 0? freqCompare :a.compareTo(b);
        });

        return result.subList(0,Math.min(3,result.size()));
        }

        public static void main(String[] args) {
            String[] sentences = {"i love you", "island", "iroman", "i love leetcode"};
            int[] times = {5, 3, 2, 2};
            AutoCompleteSystem acs = new AutoCompleteSystem(sentences, times);
    
            System.out.println(acs.input('i')); // ["i love you", "island", "i love leetcode"]
            System.out.println(acs.input(' ')); // ["i love you", "i love leetcode"]
            System.out.println(acs.input('a')); // []
            System.out.println(acs.input('#')); // []
    
            System.out.println(acs.input('i')); // ["i love you", "island", "i love leetcode"]
            System.out.println(acs.input(' ')); // ["i love you", "i love leetcode"]
            System.out.println(acs.input('a')); // []
            System.out.println(acs.input('#')); // []
        }
 }
