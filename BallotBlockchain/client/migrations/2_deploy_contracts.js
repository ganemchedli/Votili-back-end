var BallotVote = artifacts.require("BallotVote.sol");

module.exports = function (deployer) {
  deployer.deploy(BallotVote);
};
