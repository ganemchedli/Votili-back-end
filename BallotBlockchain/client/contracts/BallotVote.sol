// SPDX-License-Identifier: MIT
pragma solidity ^0.8.4;

import "./OracleInterface.sol";
import "./Ownable.sol";

/// @title BallotVote
/// @author Ichrak Ben Hsinne and Ganem Chedli
/// @notice Make Ballot to vote on a candidate
contract BallotVote is Ownable {
    //variables
    address public ChairPerson;
    Candidate[] public Candidates;
    VoteCard[] public VoteCards;
    //Ballot results oracle
    address internal BallotVoteOracleAddr =
        0x481df3B592385239A6E88ed5A5e2aE3cB5562F4D;
    OracleInterface internal BallotVoteOracle =
        OracleInterface(BallotVoteOracleAddr);

    //mappings
    mapping(address => Voter) private voterRegister;
    mapping(address => Voter) public AutorizedVotersAddress;
    //structs
    struct Voter {
        int id;
        string name;
        uint256 cin;
        uint8 age;
        string region;
        Genre genre; // enum
        bool bac;
        bool voted;
        uint weight;
    }

    struct Candidate {
        uint id;
        string name;
        uint voteCount;
    }

    struct VoteCard {
        Voter votant;
        Candidate candidate;
        uint256 DateVote;
        string codeElection;
    }

    enum Genre {
        Homme,
        Femme
    }

    ///@notice give the right to vote to an address
    ///@param voter the address of the voter
    function giveRightTovote(address voter) public view {
        BallotVoteOracle.giveRightTovote(voter);
    }

    ///@notice add candidate to the array of candidates
    ///@param candidate the candidate to add
    function addCandidate(Candidate memory candidate) public  {
        require(msg.sender == ChairPerson);
        Candidates.push(candidate);
    }

    ///@notice add voter to the array of voters
    ///@param voterAddress the address of the voter
    function addVoter(address voterAddress) public view {
        BallotVoteOracle.addVoter(voterAddress);
    }

    ///@notice vote on an candidate based on his idCandidate
    ///@param idCandidate the id of the candidate
    function addCardvote(uint idCandidate) public {
        BallotVoteOracle.addCardvote(idCandidate);
    }

    /// @notice gets the winningCandidate_ of the ballot oracle
    /// @param winningCandidate_ the address of the ballot oracle
    /// @return winningCandidate_ the winning candidate of the ballot oracle
    function getWinningCandidate()
        public
        view
        returns (uint winningCandidate_)
    {
        winningCandidate_ = BallotVoteOracle.getWinningCandidate();
    }

    ///@notice gets the winningName_ of the ballot oracle
    ///@param winningName_ the address of the ballot oracle
    ///@return winningName_ the winning name of the ballot oracle
    function getWinningName() public view returns (string memory winningName_) {
        winningName_ = BallotVoteOracle.getWinningName();
    }

    /// @notice sets the address of the ballot oracle contract to use
    /// @dev setting a wrong address may result in false return value, or error
    /// @param _oracleAddress the address of the ballot oracle
    /// @return true if connection to the new oracle address was successful
    function setOracleAddress(
        address _oracleAddress
    ) external onlyOwner returns (bool) {
        BallotVoteOracleAddr = _oracleAddress;
        BallotVoteOracle = OracleInterface(BallotVoteOracleAddr);
        return BallotVoteOracle.testConnection();
    }

    /// @notice gets the address of the ballot oracle being used
    /// @return the address of the currently set oracle
    function getOracleAddress() external view returns (address) {
        return BallotVoteOracleAddr;
    }
}
