////////////////////////////////////////////////////////////////////////////////
//
// The JavaPOS library source code is under the CPL license, which 
// is an OSS Apache-like license. The complete license is located at:
//    http://www.ibm.com/developerworks/library/os-cpl.html
//
//------------------------------------------------------------------------------
// This software is provided "AS IS".  The JavaPOS working group (including
// each of the Corporate members, contributors and individuals)  MAKES NO
// REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF THE SOFTWARE,
// EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE IMPLIED
// WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
// NON-INFRINGEMENT. The JavaPOS working group shall not be liable for
// any damages suffered as a result of using, modifying or distributing this
// software or its derivatives.Permission to use, copy, modify, and distribute
// the software and its documentation for any purpose is hereby granted.
////////////////////////////////////////////////////////////////////////////////

package jpos;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import jpos.config.JposEntryRegistry;
import jpos.loader.JposServiceLoader;
import jpos.services.EventCallbacks;

/**
 * ElectronicJournal device control JUnit test.
 * <br>
 * Generated through jpos.build.controls.JavaPOSDeviceControlTestGenerator for JavaPOS version 1.14
 */
public class ElectronicJournalTest {

    private static final String OPENNAME_ALL_METHODS_THROWING_NPE = "ElectronicJournalTestServiceAlwaysThrowingNPE";
    private static final String OPENNAME_SERVICE_10 = "ElectronicJournalTestService110";
    private static final String OPENNAME_SERVICE_110 = "ElectronicJournalTestService110";
    private static final String OPENNAME_SERVICE_111 = "ElectronicJournalTestService111";
    private static final String OPENNAME_SERVICE_112 = "ElectronicJournalTestService112";
    private static final String OPENNAME_SERVICE_113 = "ElectronicJournalTestService113";
    private static final String OPENNAME_SERVICE_114 = "ElectronicJournalTestService114";

    /**
     * @throws java.lang.Exception
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        JposEntryRegistry registry = JposServiceLoader.getManager().getEntryRegistry();
        registry.addJposEntry(ControlsTestHelper.createJposEntry("ElectronicJournal", OPENNAME_ALL_METHODS_THROWING_NPE, "1.14"));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("ElectronicJournal", OPENNAME_SERVICE_110, "1.10"));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("ElectronicJournal", OPENNAME_SERVICE_111, "1.11"));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("ElectronicJournal", OPENNAME_SERVICE_112, "1.12"));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("ElectronicJournal", OPENNAME_SERVICE_113, "1.13"));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("ElectronicJournal", OPENNAME_SERVICE_114, "1.14"));
    }

    /**
     * @throws java.lang.Exception
     */
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        JposEntryRegistry registry = JposServiceLoader.getManager().getEntryRegistry();
        registry.removeJposEntry(OPENNAME_ALL_METHODS_THROWING_NPE);
        registry.removeJposEntry(OPENNAME_SERVICE_110);
        registry.removeJposEntry(OPENNAME_SERVICE_111);
        registry.removeJposEntry(OPENNAME_SERVICE_112);
        registry.removeJposEntry(OPENNAME_SERVICE_113);
        registry.removeJposEntry(OPENNAME_SERVICE_114);
    }

    private ElectronicJournal control;

    @Before
    public void setUp() throws Exception {
        this.control = new ElectronicJournal();
    }

    @After
    public void tearDown() throws Exception {
        this.control = null;
    }

    /**
     * Test method for {@link jpos.ElectronicJournal#createEventCallbacks()}.
     */
    @Test
    public final void testCreateEventCallbacks() {
        EventCallbacks callbacks = this.control.createEventCallbacks();
        assertThat(callbacks, is(notNullValue()));
    }
    
    @Test
    public final void testGetAsyncModeFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getAsyncMode();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testSetAsyncModeFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.setAsyncMode(true);
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetAutoDisableFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getAutoDisable();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testSetAutoDisableFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.setAutoDisable(true);
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCapAddMarkerFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapAddMarker();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCapCompareFirmwareVersionFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapCompareFirmwareVersion();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCapErasableMediumFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapErasableMedium();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCapInitializeMediumFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapInitializeMedium();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCapMediumIsAvailableFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapMediumIsAvailable();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCapPowerReportingFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapPowerReporting();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCapPrintContentFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapPrintContent();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCapPrintContentFileFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapPrintContentFile();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCapRetrieveCurrentMarkerFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapRetrieveCurrentMarker();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCapRetrieveMarkerFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapRetrieveMarker();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCapRetrieveMarkerByDateTimeFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapRetrieveMarkerByDateTime();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCapRetrieveMarkersDateTimeFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapRetrieveMarkersDateTime();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCapStationFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapStation();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCapStatisticsReportingFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapStatisticsReporting();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCapStorageEnabledFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapStorageEnabled();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCapSuspendPrintContentFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapSuspendPrintContent();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCapSuspendQueryContentFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapSuspendQueryContent();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCapUpdateFirmwareFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapUpdateFirmware();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCapUpdateStatisticsFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapUpdateStatistics();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCapWaterMarkFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapWaterMark();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCheckHealthTextFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCheckHealthText();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetClaimedFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getClaimed();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetDataCountFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getDataCount();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetDataEventEnabledFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getDataEventEnabled();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testSetDataEventEnabledFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.setDataEventEnabled(true);
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetDeviceEnabledFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getDeviceEnabled();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testSetDeviceEnabledFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.setDeviceEnabled(true);
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetDeviceServiceDescriptionFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getDeviceServiceDescription();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetFlagWhenIdleFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getFlagWhenIdle();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testSetFlagWhenIdleFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.setFlagWhenIdle(true);
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetFreezeEventsFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getFreezeEvents();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testSetFreezeEventsFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.setFreezeEvents(true);
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetMediumFreeSpaceFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getMediumFreeSpace();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetMediumIDFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getMediumID();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetMediumIsAvailableFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getMediumIsAvailable();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetMediumSizeFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getMediumSize();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetOutputIDFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getOutputID();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetPhysicalDeviceDescriptionFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getPhysicalDeviceDescription();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetPhysicalDeviceNameFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getPhysicalDeviceName();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetPowerNotifyFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getPowerNotify();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testSetPowerNotifyFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.setPowerNotify(0);
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetPowerStateFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getPowerState();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetStationFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getStation();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testSetStationFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.setStation(0);
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetStorageEnabledFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getStorageEnabled();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testSetStorageEnabledFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.setStorageEnabled(true);
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetSuspendedFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getSuspended();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetWaterMarkFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getWaterMark();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testSetWaterMarkFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.setWaterMark(true);
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testAddMarkerFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.addMarker("");
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testCancelPrintContentFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.cancelPrintContent();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testCancelQueryContentFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.cancelQueryContent();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testCheckHealthFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.checkHealth(0);
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testClaimFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.claim(0);
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testClearInputFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.clearInput();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testClearOutputFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.clearOutput();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testCloseFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.close();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testCompareFirmwareVersionFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.compareFirmwareVersion("",new int[0]);
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testDirectIOFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.directIO(0,new int[0],new Object());
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testEraseMediumFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.eraseMedium();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testInitializeMediumFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.initializeMedium("");
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testPrintContentFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.printContent("","");
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testPrintContentFileFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.printContentFile("");
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testQueryContentFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.queryContent("","","");
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testReleaseFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.release();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testResetStatisticsFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.resetStatistics("");
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testResumePrintContentFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.resumePrintContent();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testResumeQueryContentFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.resumeQueryContent();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testRetrieveCurrentMarkerFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.retrieveCurrentMarker(0,new String[0]);
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testRetrieveMarkerFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.retrieveMarker(0,0,0,new String[0]);
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testRetrieveMarkerByDateTimeFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.retrieveMarkerByDateTime(0,"","",new String[0]);
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testRetrieveMarkersDateTimeFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.retrieveMarkersDateTime("",new String[0]);
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testRetrieveStatisticsFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.retrieveStatistics(new String[0]);
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testSuspendPrintContentFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.suspendPrintContent();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testSuspendQueryContentFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.suspendQueryContent();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testUpdateFirmwareFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.updateFirmware("");
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testUpdateStatisticsFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.updateStatistics("");
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetAsyncModeFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getAsyncMode();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testSetAsyncModeFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.setAsyncMode(true);
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetAutoDisableFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getAutoDisable();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testSetAutoDisableFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.setAutoDisable(true);
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCapAddMarkerFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapAddMarker();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCapCompareFirmwareVersionFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapCompareFirmwareVersion();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCapErasableMediumFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapErasableMedium();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCapInitializeMediumFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapInitializeMedium();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCapMediumIsAvailableFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapMediumIsAvailable();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCapPowerReportingFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapPowerReporting();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCapPrintContentFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapPrintContent();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCapPrintContentFileFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapPrintContentFile();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCapRetrieveCurrentMarkerFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapRetrieveCurrentMarker();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCapRetrieveMarkerFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapRetrieveMarker();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCapRetrieveMarkerByDateTimeFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapRetrieveMarkerByDateTime();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCapRetrieveMarkersDateTimeFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapRetrieveMarkersDateTime();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCapStationFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapStation();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCapStatisticsReportingFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapStatisticsReporting();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCapStorageEnabledFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapStorageEnabled();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCapSuspendPrintContentFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapSuspendPrintContent();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCapSuspendQueryContentFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapSuspendQueryContent();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCapUpdateFirmwareFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapUpdateFirmware();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCapUpdateStatisticsFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapUpdateStatistics();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCapWaterMarkFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapWaterMark();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCheckHealthTextFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCheckHealthText();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetClaimedFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getClaimed();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetDataCountFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getDataCount();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetDataEventEnabledFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getDataEventEnabled();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testSetDataEventEnabledFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.setDataEventEnabled(true);
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetDeviceEnabledFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getDeviceEnabled();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testSetDeviceEnabledFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.setDeviceEnabled(true);
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetDeviceServiceDescriptionFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getDeviceServiceDescription();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetFlagWhenIdleFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getFlagWhenIdle();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testSetFlagWhenIdleFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.setFlagWhenIdle(true);
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetFreezeEventsFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getFreezeEvents();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testSetFreezeEventsFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.setFreezeEvents(true);
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetMediumFreeSpaceFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getMediumFreeSpace();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetMediumIDFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getMediumID();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetMediumIsAvailableFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getMediumIsAvailable();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetMediumSizeFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getMediumSize();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetOutputIDFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getOutputID();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetPhysicalDeviceDescriptionFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getPhysicalDeviceDescription();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetPhysicalDeviceNameFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getPhysicalDeviceName();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetPowerNotifyFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getPowerNotify();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testSetPowerNotifyFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.setPowerNotify(0);
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetPowerStateFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getPowerState();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetStationFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getStation();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testSetStationFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.setStation(0);
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetStorageEnabledFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getStorageEnabled();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testSetStorageEnabledFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.setStorageEnabled(true);
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetSuspendedFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getSuspended();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetWaterMarkFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getWaterMark();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testSetWaterMarkFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.setWaterMark(true);
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testAddMarkerFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.addMarker("");
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testCancelPrintContentFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.cancelPrintContent();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testCancelQueryContentFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.cancelQueryContent();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testCheckHealthFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.checkHealth(0);
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testClaimFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.claim(0);
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testClearInputFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.clearInput();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testClearOutputFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.clearOutput();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testCloseFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.close();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testCompareFirmwareVersionFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.compareFirmwareVersion("",new int[0]);
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testDirectIOFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.directIO(0,new int[0],new Object());
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testEraseMediumFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.eraseMedium();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testInitializeMediumFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.initializeMedium("");
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testPrintContentFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.printContent("","");
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testPrintContentFileFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.printContentFile("");
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testQueryContentFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.queryContent("","","");
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testReleaseFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.release();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testResetStatisticsFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.resetStatistics("");
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testResumePrintContentFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.resumePrintContent();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testResumeQueryContentFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.resumeQueryContent();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testRetrieveCurrentMarkerFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.retrieveCurrentMarker(0,new String[0]);
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testRetrieveMarkerFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.retrieveMarker(0,0,0,new String[0]);
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testRetrieveMarkerByDateTimeFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.retrieveMarkerByDateTime(0,"","",new String[0]);
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testRetrieveMarkersDateTimeFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.retrieveMarkersDateTime("",new String[0]);
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testRetrieveStatisticsFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.retrieveStatistics(new String[0]);
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testSuspendPrintContentFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.suspendPrintContent();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testSuspendQueryContentFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.suspendQueryContent();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testUpdateFirmwareFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.updateFirmware("");
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testUpdateStatisticsFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.updateStatistics("");
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetDeviceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            assertThat(this.control.getDeviceServiceVersion(), is(1010000));
        }
        catch (JposException e) {
            fail("ElectronicJournal.getDeviceServiceVersion() failed with " + e.getMessage());
        }
    }
    
    @Test
    public final void testGetDeviceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            assertThat(this.control.getDeviceServiceVersion(), is(1011000));
        }
        catch (JposException e) {
            fail("ElectronicJournal.getDeviceServiceVersion() failed with " + e.getMessage());
        }
    }
    
    @Test
    public final void testGetDeviceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            assertThat(this.control.getDeviceServiceVersion(), is(1012000));
        }
        catch (JposException e) {
            fail("ElectronicJournal.getDeviceServiceVersion() failed with " + e.getMessage());
        }
    }
    
    @Test
    public final void testGetDeviceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            assertThat(this.control.getDeviceServiceVersion(), is(1013000));
        }
        catch (JposException e) {
            fail("ElectronicJournal.getDeviceServiceVersion() failed with " + e.getMessage());
        }
    }
    
    @Test
    public final void testGetDeviceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            assertThat(this.control.getDeviceServiceVersion(), is(1014000));
        }
        catch (JposException e) {
            fail("ElectronicJournal.getDeviceServiceVersion() failed with " + e.getMessage());
        }
    }
    
    
    @Test
    public void testGetAsyncModeCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getAsyncMode();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAsyncModeCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getAsyncMode();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAsyncModeCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getAsyncMode();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAsyncModeCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getAsyncMode();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAsyncModeCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getAsyncMode();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetAsyncModeCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.setAsyncMode(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testSetAsyncModeCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.setAsyncMode(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetAsyncModeCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.setAsyncMode(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetAsyncModeCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.setAsyncMode(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetAsyncModeCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.setAsyncMode(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetAutoDisableCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getAutoDisable();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAutoDisableCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getAutoDisable();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAutoDisableCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getAutoDisable();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAutoDisableCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getAutoDisable();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAutoDisableCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getAutoDisable();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetAutoDisableCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.setAutoDisable(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testSetAutoDisableCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.setAutoDisable(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetAutoDisableCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.setAutoDisable(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetAutoDisableCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.setAutoDisable(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetAutoDisableCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.setAutoDisable(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetCapAddMarkerCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getCapAddMarker();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapAddMarkerCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getCapAddMarker();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapAddMarkerCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCapAddMarker();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapAddMarkerCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapAddMarker();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapAddMarkerCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapAddMarker();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetCapCompareFirmwareVersionCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getCapCompareFirmwareVersion();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapCompareFirmwareVersionCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getCapCompareFirmwareVersion();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapCompareFirmwareVersionCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCapCompareFirmwareVersion();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapCompareFirmwareVersionCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapCompareFirmwareVersion();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapCompareFirmwareVersionCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapCompareFirmwareVersion();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetCapErasableMediumCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getCapErasableMedium();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapErasableMediumCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getCapErasableMedium();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapErasableMediumCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCapErasableMedium();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapErasableMediumCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapErasableMedium();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapErasableMediumCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapErasableMedium();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetCapInitializeMediumCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getCapInitializeMedium();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapInitializeMediumCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getCapInitializeMedium();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapInitializeMediumCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCapInitializeMedium();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapInitializeMediumCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapInitializeMedium();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapInitializeMediumCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapInitializeMedium();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetCapMediumIsAvailableCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getCapMediumIsAvailable();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapMediumIsAvailableCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getCapMediumIsAvailable();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapMediumIsAvailableCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCapMediumIsAvailable();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapMediumIsAvailableCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapMediumIsAvailable();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapMediumIsAvailableCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapMediumIsAvailable();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetCapPowerReportingCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getCapPowerReporting();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapPowerReportingCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getCapPowerReporting();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapPowerReportingCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCapPowerReporting();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapPowerReportingCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapPowerReporting();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapPowerReportingCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapPowerReporting();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetCapPrintContentCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getCapPrintContent();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapPrintContentCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getCapPrintContent();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapPrintContentCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCapPrintContent();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapPrintContentCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapPrintContent();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapPrintContentCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapPrintContent();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetCapPrintContentFileCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getCapPrintContentFile();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapPrintContentFileCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getCapPrintContentFile();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapPrintContentFileCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCapPrintContentFile();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapPrintContentFileCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapPrintContentFile();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapPrintContentFileCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapPrintContentFile();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetCapRetrieveCurrentMarkerCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getCapRetrieveCurrentMarker();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapRetrieveCurrentMarkerCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getCapRetrieveCurrentMarker();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapRetrieveCurrentMarkerCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCapRetrieveCurrentMarker();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapRetrieveCurrentMarkerCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapRetrieveCurrentMarker();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapRetrieveCurrentMarkerCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapRetrieveCurrentMarker();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetCapRetrieveMarkerCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getCapRetrieveMarker();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapRetrieveMarkerCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getCapRetrieveMarker();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapRetrieveMarkerCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCapRetrieveMarker();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapRetrieveMarkerCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapRetrieveMarker();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapRetrieveMarkerCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapRetrieveMarker();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetCapRetrieveMarkerByDateTimeCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getCapRetrieveMarkerByDateTime();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapRetrieveMarkerByDateTimeCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getCapRetrieveMarkerByDateTime();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapRetrieveMarkerByDateTimeCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCapRetrieveMarkerByDateTime();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapRetrieveMarkerByDateTimeCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapRetrieveMarkerByDateTime();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapRetrieveMarkerByDateTimeCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapRetrieveMarkerByDateTime();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetCapRetrieveMarkersDateTimeCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getCapRetrieveMarkersDateTime();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapRetrieveMarkersDateTimeCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getCapRetrieveMarkersDateTime();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapRetrieveMarkersDateTimeCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCapRetrieveMarkersDateTime();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapRetrieveMarkersDateTimeCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapRetrieveMarkersDateTime();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapRetrieveMarkersDateTimeCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapRetrieveMarkersDateTime();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetCapStationCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getCapStation();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapStationCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getCapStation();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapStationCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCapStation();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapStationCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapStation();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapStationCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapStation();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetCapStatisticsReportingCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getCapStatisticsReporting();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapStatisticsReportingCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getCapStatisticsReporting();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapStatisticsReportingCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCapStatisticsReporting();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapStatisticsReportingCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapStatisticsReporting();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapStatisticsReportingCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapStatisticsReporting();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetCapStorageEnabledCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getCapStorageEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapStorageEnabledCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getCapStorageEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapStorageEnabledCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCapStorageEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapStorageEnabledCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapStorageEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapStorageEnabledCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapStorageEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetCapSuspendPrintContentCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getCapSuspendPrintContent();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapSuspendPrintContentCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getCapSuspendPrintContent();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapSuspendPrintContentCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCapSuspendPrintContent();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapSuspendPrintContentCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapSuspendPrintContent();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapSuspendPrintContentCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapSuspendPrintContent();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetCapSuspendQueryContentCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getCapSuspendQueryContent();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapSuspendQueryContentCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getCapSuspendQueryContent();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapSuspendQueryContentCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCapSuspendQueryContent();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapSuspendQueryContentCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapSuspendQueryContent();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapSuspendQueryContentCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapSuspendQueryContent();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetCapUpdateFirmwareCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getCapUpdateFirmware();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapUpdateFirmwareCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getCapUpdateFirmware();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapUpdateFirmwareCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCapUpdateFirmware();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapUpdateFirmwareCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapUpdateFirmware();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapUpdateFirmwareCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapUpdateFirmware();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetCapUpdateStatisticsCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getCapUpdateStatistics();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapUpdateStatisticsCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getCapUpdateStatistics();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapUpdateStatisticsCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCapUpdateStatistics();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapUpdateStatisticsCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapUpdateStatistics();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapUpdateStatisticsCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapUpdateStatistics();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetCapWaterMarkCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getCapWaterMark();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapWaterMarkCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getCapWaterMark();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapWaterMarkCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCapWaterMark();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapWaterMarkCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapWaterMark();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapWaterMarkCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapWaterMark();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetCheckHealthTextCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_10);
            this.control.getCheckHealthText();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCheckHealthTextCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getCheckHealthText();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCheckHealthTextCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCheckHealthText();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCheckHealthTextCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCheckHealthText();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCheckHealthTextCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCheckHealthText();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetClaimedCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_10);
            this.control.getClaimed();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetClaimedCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getClaimed();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetClaimedCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getClaimed();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetClaimedCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getClaimed();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetClaimedCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getClaimed();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetDataCountCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getDataCount();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataCountCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getDataCount();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataCountCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getDataCount();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataCountCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getDataCount();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataCountCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getDataCount();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetDataEventEnabledCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getDataEventEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataEventEnabledCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getDataEventEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataEventEnabledCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getDataEventEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataEventEnabledCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getDataEventEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataEventEnabledCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getDataEventEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDataEventEnabledCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.setDataEventEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testSetDataEventEnabledCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.setDataEventEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDataEventEnabledCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.setDataEventEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDataEventEnabledCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.setDataEventEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDataEventEnabledCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.setDataEventEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetDeviceEnabledCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_10);
            this.control.getDeviceEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceEnabledCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getDeviceEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceEnabledCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getDeviceEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceEnabledCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getDeviceEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceEnabledCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getDeviceEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDeviceEnabledCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_10);
            this.control.setDeviceEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testSetDeviceEnabledCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.setDeviceEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDeviceEnabledCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.setDeviceEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDeviceEnabledCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.setDeviceEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDeviceEnabledCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.setDeviceEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetDeviceServiceDescriptionCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_10);
            this.control.getDeviceServiceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceServiceDescriptionCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getDeviceServiceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceServiceDescriptionCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getDeviceServiceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceServiceDescriptionCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getDeviceServiceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceServiceDescriptionCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getDeviceServiceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetFlagWhenIdleCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getFlagWhenIdle();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetFlagWhenIdleCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getFlagWhenIdle();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetFlagWhenIdleCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getFlagWhenIdle();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetFlagWhenIdleCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getFlagWhenIdle();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetFlagWhenIdleCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getFlagWhenIdle();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetFlagWhenIdleCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.setFlagWhenIdle(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testSetFlagWhenIdleCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.setFlagWhenIdle(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetFlagWhenIdleCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.setFlagWhenIdle(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetFlagWhenIdleCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.setFlagWhenIdle(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetFlagWhenIdleCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.setFlagWhenIdle(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetFreezeEventsCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_10);
            this.control.getFreezeEvents();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetFreezeEventsCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getFreezeEvents();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetFreezeEventsCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getFreezeEvents();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetFreezeEventsCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getFreezeEvents();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetFreezeEventsCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getFreezeEvents();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetFreezeEventsCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_10);
            this.control.setFreezeEvents(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testSetFreezeEventsCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.setFreezeEvents(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetFreezeEventsCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.setFreezeEvents(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetFreezeEventsCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.setFreezeEvents(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetFreezeEventsCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.setFreezeEvents(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetMediumFreeSpaceCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getMediumFreeSpace();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMediumFreeSpaceCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getMediumFreeSpace();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMediumFreeSpaceCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getMediumFreeSpace();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMediumFreeSpaceCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getMediumFreeSpace();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMediumFreeSpaceCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getMediumFreeSpace();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetMediumIDCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getMediumID();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMediumIDCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getMediumID();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMediumIDCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getMediumID();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMediumIDCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getMediumID();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMediumIDCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getMediumID();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetMediumIsAvailableCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getMediumIsAvailable();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMediumIsAvailableCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getMediumIsAvailable();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMediumIsAvailableCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getMediumIsAvailable();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMediumIsAvailableCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getMediumIsAvailable();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMediumIsAvailableCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getMediumIsAvailable();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetMediumSizeCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getMediumSize();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMediumSizeCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getMediumSize();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMediumSizeCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getMediumSize();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMediumSizeCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getMediumSize();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMediumSizeCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getMediumSize();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetOutputIDCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getOutputID();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetOutputIDCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getOutputID();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetOutputIDCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getOutputID();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetOutputIDCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getOutputID();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetOutputIDCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getOutputID();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetPhysicalDeviceDescriptionCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_10);
            this.control.getPhysicalDeviceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPhysicalDeviceDescriptionCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getPhysicalDeviceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPhysicalDeviceDescriptionCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getPhysicalDeviceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPhysicalDeviceDescriptionCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getPhysicalDeviceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPhysicalDeviceDescriptionCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getPhysicalDeviceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetPhysicalDeviceNameCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_10);
            this.control.getPhysicalDeviceName();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPhysicalDeviceNameCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getPhysicalDeviceName();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPhysicalDeviceNameCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getPhysicalDeviceName();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPhysicalDeviceNameCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getPhysicalDeviceName();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPhysicalDeviceNameCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getPhysicalDeviceName();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetPowerNotifyCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getPowerNotify();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerNotifyCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getPowerNotify();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerNotifyCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getPowerNotify();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerNotifyCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getPowerNotify();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerNotifyCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getPowerNotify();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetPowerNotifyCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.setPowerNotify(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testSetPowerNotifyCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.setPowerNotify(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetPowerNotifyCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.setPowerNotify(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetPowerNotifyCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.setPowerNotify(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetPowerNotifyCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.setPowerNotify(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetPowerStateCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getPowerState();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerStateCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getPowerState();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerStateCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getPowerState();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerStateCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getPowerState();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerStateCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getPowerState();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetStationCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getStation();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetStationCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getStation();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetStationCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getStation();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetStationCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getStation();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetStationCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getStation();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetStationCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.setStation(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testSetStationCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.setStation(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetStationCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.setStation(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetStationCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.setStation(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetStationCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.setStation(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetStorageEnabledCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getStorageEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetStorageEnabledCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getStorageEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetStorageEnabledCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getStorageEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetStorageEnabledCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getStorageEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetStorageEnabledCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getStorageEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetStorageEnabledCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.setStorageEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testSetStorageEnabledCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.setStorageEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetStorageEnabledCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.setStorageEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetStorageEnabledCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.setStorageEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetStorageEnabledCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.setStorageEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetSuspendedCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getSuspended();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetSuspendedCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getSuspended();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetSuspendedCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getSuspended();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetSuspendedCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getSuspended();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetSuspendedCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getSuspended();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetWaterMarkCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getWaterMark();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetWaterMarkCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getWaterMark();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetWaterMarkCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getWaterMark();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetWaterMarkCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getWaterMark();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetWaterMarkCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getWaterMark();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetWaterMarkCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.setWaterMark(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testSetWaterMarkCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.setWaterMark(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetWaterMarkCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.setWaterMark(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetWaterMarkCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.setWaterMark(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetWaterMarkCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.setWaterMark(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testAddMarkerCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.addMarker("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testAddMarkerCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.addMarker("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testAddMarkerCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.addMarker("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testAddMarkerCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.addMarker("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testAddMarkerCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.addMarker("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testCancelPrintContentCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.cancelPrintContent();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCancelPrintContentCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.cancelPrintContent();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCancelPrintContentCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.cancelPrintContent();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCancelPrintContentCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.cancelPrintContent();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCancelPrintContentCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.cancelPrintContent();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testCancelQueryContentCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.cancelQueryContent();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCancelQueryContentCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.cancelQueryContent();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCancelQueryContentCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.cancelQueryContent();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCancelQueryContentCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.cancelQueryContent();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCancelQueryContentCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.cancelQueryContent();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testCheckHealthCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_10);
            this.control.checkHealth(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCheckHealthCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.checkHealth(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCheckHealthCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.checkHealth(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCheckHealthCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.checkHealth(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCheckHealthCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.checkHealth(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testClaimCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_10);
            this.control.claim(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClaimCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.claim(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClaimCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.claim(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClaimCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.claim(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClaimCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.claim(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testClearInputCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.clearInput();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClearInputCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.clearInput();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClearInputCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.clearInput();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClearInputCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.clearInput();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClearInputCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.clearInput();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testClearOutputCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.clearOutput();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClearOutputCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.clearOutput();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClearOutputCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.clearOutput();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClearOutputCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.clearOutput();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClearOutputCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.clearOutput();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testCloseCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_10);
            this.control.close();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCloseCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.close();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCloseCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.close();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCloseCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.close();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCloseCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.close();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testCompareFirmwareVersionCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.compareFirmwareVersion("",new int[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCompareFirmwareVersionCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.compareFirmwareVersion("",new int[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCompareFirmwareVersionCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.compareFirmwareVersion("",new int[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCompareFirmwareVersionCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.compareFirmwareVersion("",new int[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCompareFirmwareVersionCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.compareFirmwareVersion("",new int[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testDirectIOCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_10);
            this.control.directIO(0,new int[0],new Object());
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testDirectIOCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.directIO(0,new int[0],new Object());
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testDirectIOCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.directIO(0,new int[0],new Object());
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testDirectIOCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.directIO(0,new int[0],new Object());
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testDirectIOCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.directIO(0,new int[0],new Object());
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testEraseMediumCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.eraseMedium();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testEraseMediumCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.eraseMedium();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testEraseMediumCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.eraseMedium();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testEraseMediumCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.eraseMedium();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testEraseMediumCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.eraseMedium();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testInitializeMediumCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.initializeMedium("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testInitializeMediumCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.initializeMedium("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testInitializeMediumCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.initializeMedium("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testInitializeMediumCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.initializeMedium("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testInitializeMediumCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.initializeMedium("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testPrintContentCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.printContent("","");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testPrintContentCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.printContent("","");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testPrintContentCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.printContent("","");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testPrintContentCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.printContent("","");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testPrintContentCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.printContent("","");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testPrintContentFileCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.printContentFile("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testPrintContentFileCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.printContentFile("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testPrintContentFileCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.printContentFile("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testPrintContentFileCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.printContentFile("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testPrintContentFileCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.printContentFile("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testQueryContentCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.queryContent("","","");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testQueryContentCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.queryContent("","","");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testQueryContentCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.queryContent("","","");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testQueryContentCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.queryContent("","","");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testQueryContentCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.queryContent("","","");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testReleaseCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_10);
            this.control.release();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testReleaseCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.release();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testReleaseCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.release();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testReleaseCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.release();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testReleaseCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.release();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testResetStatisticsCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.resetStatistics("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testResetStatisticsCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.resetStatistics("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testResetStatisticsCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.resetStatistics("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testResetStatisticsCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.resetStatistics("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testResetStatisticsCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.resetStatistics("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testResumePrintContentCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.resumePrintContent();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testResumePrintContentCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.resumePrintContent();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testResumePrintContentCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.resumePrintContent();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testResumePrintContentCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.resumePrintContent();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testResumePrintContentCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.resumePrintContent();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testResumeQueryContentCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.resumeQueryContent();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testResumeQueryContentCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.resumeQueryContent();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testResumeQueryContentCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.resumeQueryContent();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testResumeQueryContentCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.resumeQueryContent();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testResumeQueryContentCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.resumeQueryContent();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testRetrieveCurrentMarkerCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.retrieveCurrentMarker(0,new String[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testRetrieveCurrentMarkerCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.retrieveCurrentMarker(0,new String[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testRetrieveCurrentMarkerCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.retrieveCurrentMarker(0,new String[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testRetrieveCurrentMarkerCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.retrieveCurrentMarker(0,new String[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testRetrieveCurrentMarkerCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.retrieveCurrentMarker(0,new String[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testRetrieveMarkerCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.retrieveMarker(0,0,0,new String[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testRetrieveMarkerCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.retrieveMarker(0,0,0,new String[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testRetrieveMarkerCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.retrieveMarker(0,0,0,new String[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testRetrieveMarkerCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.retrieveMarker(0,0,0,new String[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testRetrieveMarkerCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.retrieveMarker(0,0,0,new String[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testRetrieveMarkerByDateTimeCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.retrieveMarkerByDateTime(0,"","",new String[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testRetrieveMarkerByDateTimeCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.retrieveMarkerByDateTime(0,"","",new String[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testRetrieveMarkerByDateTimeCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.retrieveMarkerByDateTime(0,"","",new String[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testRetrieveMarkerByDateTimeCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.retrieveMarkerByDateTime(0,"","",new String[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testRetrieveMarkerByDateTimeCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.retrieveMarkerByDateTime(0,"","",new String[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testRetrieveMarkersDateTimeCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.retrieveMarkersDateTime("",new String[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testRetrieveMarkersDateTimeCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.retrieveMarkersDateTime("",new String[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testRetrieveMarkersDateTimeCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.retrieveMarkersDateTime("",new String[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testRetrieveMarkersDateTimeCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.retrieveMarkersDateTime("",new String[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testRetrieveMarkersDateTimeCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.retrieveMarkersDateTime("",new String[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testRetrieveStatisticsCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.retrieveStatistics(new String[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testRetrieveStatisticsCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.retrieveStatistics(new String[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testRetrieveStatisticsCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.retrieveStatistics(new String[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testRetrieveStatisticsCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.retrieveStatistics(new String[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testRetrieveStatisticsCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.retrieveStatistics(new String[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testSuspendPrintContentCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.suspendPrintContent();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSuspendPrintContentCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.suspendPrintContent();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSuspendPrintContentCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.suspendPrintContent();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSuspendPrintContentCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.suspendPrintContent();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSuspendPrintContentCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.suspendPrintContent();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testSuspendQueryContentCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.suspendQueryContent();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSuspendQueryContentCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.suspendQueryContent();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSuspendQueryContentCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.suspendQueryContent();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSuspendQueryContentCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.suspendQueryContent();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSuspendQueryContentCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.suspendQueryContent();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testUpdateFirmwareCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.updateFirmware("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testUpdateFirmwareCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.updateFirmware("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testUpdateFirmwareCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.updateFirmware("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testUpdateFirmwareCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.updateFirmware("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testUpdateFirmwareCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.updateFirmware("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testUpdateStatisticsCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.updateStatistics("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testUpdateStatisticsCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.updateStatistics("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testUpdateStatisticsCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.updateStatistics("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testUpdateStatisticsCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.updateStatistics("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testUpdateStatisticsCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.updateStatistics("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
}
