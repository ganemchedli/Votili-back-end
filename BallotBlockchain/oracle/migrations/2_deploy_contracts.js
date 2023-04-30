var BallotVoteOracle = artifacts.require("./BallotVoteOracle.sol");

module.exports = function (deployer) {
  deployer.deploy(BallotVoteOracle);
};
