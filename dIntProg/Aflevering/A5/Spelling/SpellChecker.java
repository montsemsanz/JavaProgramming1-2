import java.util.*;

/**
 * SpellChecker - is a class used to order and edit the content of a dictionary.
 * 
 * @author Susie 
 * @version 1. version, 22.09.07.
 */
public class SpellChecker
{
    private ArrayList<String> words;
    
    /**
     * Create a SpellChecker. 
     */
    public SpellChecker()
    {
        DictReader reader = new DictReader("words.txt");
        words = reader.getWords();
    }

    /**
     * @return. The number of words currently listed in the dictionary.
     */
    public int numberOfWords()
    {
        return words.size();
    }

    /**
     * @return Is the word in question listed in the dictionary?
     * @param word 
     */
    public boolean isKnownWord(String word)
    {
        boolean knownWord = false;
        for(String word2 : words) {
            if(word2.equals(word)) {
                knownWord = true; 
            }    
        }
        return knownWord;
    }
            
    /**
     * @return. Are all the words on wordList known to the dictionary?
     * @param ArrayList
     */
    public boolean allKnown(ArrayList<String> wordList)
    {
        boolean allKnownWord = true;
        for(String word : wordList) {
            if(isKnownWord(word) == false) {
                allKnownWord = false; 
                
            }
        }
        return allKnownWord;
    }
         
    /**
     * @return. All words in dictionary starting with a given prefix.
     * @param prefix
     */
    public ArrayList<String> wordsStartingWith(String prefix)
    {
        prefix = prefix.toLowerCase();
        ArrayList<String> startsWithPrefix = new ArrayList<String>();
        for(String word : words) {
            if(word.toLowerCase().startsWith(prefix)) {
               startsWithPrefix.add(word); 
            }
        } 
               return startsWithPrefix;
    }
    
    /**
     * @return. All words in dictionary containing a given string of text.
     * @param text
     */
    public ArrayList<String> wordsContaining(String text)
    {
        text = text.toLowerCase();
        ArrayList<String> containsText = new ArrayList<String>();
        for(String word : words) {
            if(word.toLowerCase().contains(text)) {
                containsText.add(word);
            }    
        }        
                return containsText;
    }
        
    /**
     * Insert a new word in the dictionary (if word is already known - do nothing). 
     * @param newWord
     */
    public void insert(String newWord)
    {
        boolean finished = false;
        for(String word : words) {
            if(words.equals(newWord)) {
                finished = true;
            }
            else {
                words.add(newWord);
            }
        }
    }
    
    /**
     * Remove a word from the dictionary (if word is not known - do nothing).
     * @param newWord
     */
    public boolean remove(String newWord)
    {
        boolean removeWord = false;
        for(String word : words) {
            if(words.equals(newWord)) {
                words.remove(newWord); {
                    removeWord = true;
                }
            }
        }
        return removeWord;
    }
           
    /**
     * Save the dictionary to disk.
     */
    public void save()
    {
        DictReader reader = new DictReader("words.txt");
        reader.save(words);
    }
    
    
    /**
     * Return true if the given word is a palindrome.
     * @param word
     */
    public boolean isPalindrome(String word) 
    {
        word = word.toLowerCase();
        for(int i = 0; i < word.length()/2; i++) {
            if(word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    
    
    /**
     * ...
     */
    public ArrayList<String> anagrams(String word) {
        return null;
    }

}

