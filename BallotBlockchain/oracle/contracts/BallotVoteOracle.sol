// SPDX-License-Identifier: MIT
pragma solidity ^0.8.4;

import "./Ownable.sol";

/// @title BallotVoteOracle
/// @author Ichrak Ben Hsinne and Ganem Chedli
/// @notice Make Ballot to vote on a candidate
contract BallotVoteOracle is Ownable {
    //variables
    address public ChairPerson;
    Candidate[] public Candidates;
    VoteCard[] public VoteCards;

    //mappings
    mapping(address => Voter) private voterRegister;
    mapping(address => Voter) public AutorizedVotersAddress;
    //structs
    struct Voter {
        int id;
        bytes32 name;
        bytes32 lastName;
        uint256 cin;
        uint8 age;
        bytes32 region;
        Genre genre; // enum
        bool bac;
        bool voted;
        uint weight;
    }

    struct Candidate {
        uint id;
        bytes32 name;
        uint voteCount;
    }

    struct VoteCard {
        Voter voter;
        Candidate candidate;
        uint256 dateVote;
        string codeElection;
    }

    enum Genre {
        Homme,
        Femme
    }

    ///@notice give the right to vote to an address
    ///@param voter the address of the voter
    function giveRightToVote(address voter) public view {
        require(
            msg.sender == ChairPerson,
            "Only the chairperson can give access to vote"
        );
        require(
            !AutorizedVotersAddress[voter].voted,
            "The voter has already voted"
        );
        require(AutorizedVotersAddress[voter].weight == 0);

        AutorizedVotersAddress[voter].weight == 1;
    }

    ///@notice add voter to the array of voters
    ///@param voterAddress the address of the voter
    function addVoter(address voterAddress) public view {
        require(
            !voterRegister[voterAddress].voted,
            "The voter has already voted"
        );
        require(msg.sender == ChairPerson);
        require(voterRegister[voterAddress].weight == 0);

        voterRegister[voterAddress].weight == 1;
    }

    ///@notice vote on an candidate based on his idCandidate
    ///@param idCandidate the id of the candidate
    function addCardVote(uint idCandidate) public {
        Voter storage sender = AutorizedVotersAddress[msg.sender];
        require(sender.weight != 0, "Has no right to vote");
        require(!sender.voted, "Already voted");
        sender.voted = true;
        Candidate memory candidate = Candidates[idCandidate];
        candidate.voteCount += 1;
        VoteCard memory card = VoteCard(
            sender,
            candidate,
            block.timestamp,
            "Election2021"
        );
        VoteCards.push(card);
    }

    /// @notice gets the winningCandidate_ of the ballot oracle
    /// @param winningCandidate_ the address of the ballot oracle
    /// @return winningCandidate_ the winning candidate of the ballot oracle
    function getWinningCandidate()
        public
        view
        returns (uint winningCandidate_)
    {
        uint winningVoteCount = 0;
        for (uint i = 0; i < VoteCards.length; i++) {
            if (VoteCards[i].candidate.voteCount > winningVoteCount) {
                winningVoteCount = VoteCards[i].candidate.voteCount;
                winningCandidate_ = i;
            }
        }
    }

    ///@notice gets the winningName_ of the ballot oracle
    ///@param winningName_ the address of the ballot oracle
    ///@return winningName_ the winning name of the ballot oracle
    function getWinningName() public view returns (string memory winningName_) {
        winningName_ = Candidates[getWinningCandidate()].name;
    }
}
