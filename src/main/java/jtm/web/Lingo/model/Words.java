package jtm.web.Lingo.model;

import javax.persistence.*;

@Entity
@Table(name = "SQLWords")
public class Words {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer wordid;

    private String word;

    public Integer getWordid() {
        return wordid;
    }

    public void setWordid(Integer wordid) {
        this.wordid = wordid;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public Words(Integer wordid, String word) {
        this.wordid = wordid;
        this.word = word;
    }

    public Words(){

    }

    @Override
    public String toString() {
        return "is:  "+wordid +
                ", word='" + word + '\'';
    }
}