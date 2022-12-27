package org.tron.core.capsule;

import org.junit.Assert;
import org.junit.Test;
import org.tron.protos.contract.SmartContractOuterClass;

public class ContractStateCapsuleTest {

  @Test
  public void testCatchUpCycle() {
    ContractStateCapsule capsule = new ContractStateCapsule(
        SmartContractOuterClass.ContractState.newBuilder()
            .setEnergyUsage(1_000_000L)
            .setEnergyFactor(15_000L)
            .setUpdateCycle(1000L)
            .build());

    Assert.assertFalse(capsule.catchUpToCycle(1000L, 2_000_000L, 2_000L, 10_00L));
    Assert.assertEquals(1000L, capsule.getUpdateCycle());
    Assert.assertEquals(1_000_000L, capsule.getEnergyUsage());
    Assert.assertEquals(15_000L, capsule.getEnergyFactor());

    Assert.assertTrue(capsule.catchUpToCycle(1010L, 1_000_000L, 1_000L, 10_000L));
    Assert.assertEquals(1010L, capsule.getUpdateCycle());
    Assert.assertEquals(0L, capsule.getEnergyUsage());
    Assert.assertEquals(13_137L, capsule.getEnergyFactor());

    capsule = new ContractStateCapsule(
        SmartContractOuterClass.ContractState.newBuilder()
            .setEnergyUsage(1_000_000L)
            .setEnergyFactor(15_000L)
            .setUpdateCycle(1000L)
            .build());

    Assert.assertTrue(capsule.catchUpToCycle(1001L, 2_000_000L, 2_000L, 10_000L));
    Assert.assertEquals(1001L, capsule.getUpdateCycle());
    Assert.assertEquals(0L, capsule.getEnergyUsage());
    Assert.assertEquals(14_250L, capsule.getEnergyFactor());

    capsule = new ContractStateCapsule(
        SmartContractOuterClass.ContractState.newBuilder()
            .setEnergyUsage(1_000_000L)
            .setEnergyFactor(15_000L)
            .setUpdateCycle(1000L)
            .build());

    Assert.assertTrue(capsule.catchUpToCycle(1001L, 1_000_000L, 2_000L, 10_000L));
    Assert.assertEquals(1001L, capsule.getUpdateCycle());
    Assert.assertEquals(0L, capsule.getEnergyUsage());
    Assert.assertEquals(18_000L, capsule.getEnergyFactor());

    capsule = new ContractStateCapsule(
        SmartContractOuterClass.ContractState.newBuilder()
            .setEnergyUsage(1_000_000L)
            .setEnergyFactor(15_000L)
            .setUpdateCycle(1000L)
            .build());

    Assert.assertTrue(capsule.catchUpToCycle(1001L, 1_000_000L, 5_000L, 10_000L));
    Assert.assertEquals(1001L, capsule.getUpdateCycle());
    Assert.assertEquals(0L, capsule.getEnergyUsage());
    Assert.assertEquals(20_000L, capsule.getEnergyFactor());

    capsule = new ContractStateCapsule(
        SmartContractOuterClass.ContractState.newBuilder()
            .setEnergyUsage(1_000_000L)
            .setEnergyFactor(15_000L)
            .setUpdateCycle(1000L)
            .build());

    Assert.assertTrue(capsule.catchUpToCycle(1002L, 1_000_000L, 5_000L, 10_000L));
    Assert.assertEquals(1002L, capsule.getUpdateCycle());
    Assert.assertEquals(0L, capsule.getEnergyUsage());
    Assert.assertEquals(17_500L, capsule.getEnergyFactor());

    capsule = new ContractStateCapsule(
        SmartContractOuterClass.ContractState.newBuilder()
            .setEnergyUsage(1_000_000L)
            .setEnergyFactor(15_000L)
            .setUpdateCycle(1000L)
            .build());

    Assert.assertTrue(capsule.catchUpToCycle(1003L, 1_000_000L, 5_000L, 10_000L));
    Assert.assertEquals(1003L, capsule.getUpdateCycle());
    Assert.assertEquals(0L, capsule.getEnergyUsage());
    Assert.assertEquals(15_312L, capsule.getEnergyFactor());

    capsule = new ContractStateCapsule(
        SmartContractOuterClass.ContractState.newBuilder()
            .setEnergyUsage(1_000_000L)
            .setEnergyFactor(15_000L)
            .setUpdateCycle(1000L)
            .build());

    Assert.assertTrue(capsule.catchUpToCycle(1004L, 1_000_000L, 5_000L, 10_000L));
    Assert.assertEquals(1004L, capsule.getUpdateCycle());
    Assert.assertEquals(0L, capsule.getEnergyUsage());
    Assert.assertEquals(13_398L, capsule.getEnergyFactor());

    capsule = new ContractStateCapsule(
        SmartContractOuterClass.ContractState.newBuilder()
            .setEnergyUsage(1_000_000L)
            .setEnergyFactor(15_000L)
            .setUpdateCycle(1000L)
            .build());

    Assert.assertTrue(capsule.catchUpToCycle(1005L, 1_000_000L, 5_000L, 10_000L));
    Assert.assertEquals(1005L, capsule.getUpdateCycle());
    Assert.assertEquals(0L, capsule.getEnergyUsage());
    Assert.assertEquals(11_723L, capsule.getEnergyFactor());

    capsule = new ContractStateCapsule(
        SmartContractOuterClass.ContractState.newBuilder()
            .setEnergyUsage(1_000_000L)
            .setEnergyFactor(15_000L)
            .setUpdateCycle(1000L)
            .build());

    Assert.assertTrue(capsule.catchUpToCycle(1005L, 1_000_000L, 5_000L, 10_000L));
    Assert.assertEquals(1005L, capsule.getUpdateCycle());
    Assert.assertEquals(0L, capsule.getEnergyUsage());
    Assert.assertEquals(11_723L, capsule.getEnergyFactor());

    capsule = new ContractStateCapsule(
        SmartContractOuterClass.ContractState.newBuilder()
            .setEnergyUsage(1_000_000L)
            .setEnergyFactor(15_000L)
            .setUpdateCycle(1000L)
            .build());

    Assert.assertTrue(capsule.catchUpToCycle(1006L, 1_000_000L, 5_000L, 10_000L));
    Assert.assertEquals(1006L, capsule.getUpdateCycle());
    Assert.assertEquals(0L, capsule.getEnergyUsage());
    Assert.assertEquals(10_258L, capsule.getEnergyFactor());

    capsule = new ContractStateCapsule(
        SmartContractOuterClass.ContractState.newBuilder()
            .setEnergyUsage(1_000_000L)
            .setEnergyFactor(15_000L)
            .setUpdateCycle(1000L)
            .build());

    Assert.assertTrue(capsule.catchUpToCycle(1007L, 1_000_000L, 5_000L, 10_000L));
    Assert.assertEquals(1007L, capsule.getUpdateCycle());
    Assert.assertEquals(0L, capsule.getEnergyUsage());
    Assert.assertEquals(10_000L, capsule.getEnergyFactor());

  }

}
