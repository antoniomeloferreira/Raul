package com.raulmvp.entity;

import javax.persistence.*;

@Entity
@Table(name = "Competitionconfig")
public class CompetitionConfigEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "num_of_users")
    private Integer numOfUsers;

    @Column(name = "num_of_rounds")
    private Integer numOfRounds;

    @Column(name = "is_reverse")
    private boolean isReverse;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumOfUsers() {
        return numOfUsers;
    }

    public void setNumOfUsers(Integer numOfUsers) {
        this.numOfUsers = numOfUsers;
    }

    public Integer getNumOfRounds() {
        return numOfRounds;
    }

    public void setNumOfRounds(Integer numOfRounds) {
        this.numOfRounds = numOfRounds;
    }

    public boolean isReverse() {
        return isReverse;
    }

    public void setReverse(boolean reverse) {
        isReverse = reverse;
    }
}
