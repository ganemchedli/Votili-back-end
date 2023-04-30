// SPDX-License-Identifier: MIT
pragma solidity ^0.8.4;

import "./Ownable.sol";

interface OracleInterface {
    enum Genre {
        Homme,
        Femme
    }
    struct Candidate {
        int id;
        string name;
        uint totalVotes;
    }

    function getVoter(
        address _voterAddress
    )
        external
        view
        returns (
            int,
            string memory,
            uint256,
            uint8,
            string memory,
            Genre,
            bool,
            bool
        );

    function getCandidate() external view returns (int, string memory, uint);

    function getWinningCandidate()
        external
        view
        returns (uint winningCandidate_);

    function getWinningName()
        external
        view
        returns (string memory winningName_);

    function giveRightTovote(address voter) external view;

    function addCardvote(uint idCandidate) external view;

    function addVoter(address voterAddress) external view;

    function addCandidate(Candidate memory candidate) external view;

    function testConnection() external pure returns (bool);
}
