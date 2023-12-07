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

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import jpos.config.JposEntryRegistry;
import jpos.config.simple.SimpleEntry;
import jpos.loader.JposServiceLoader;
import jpos.services.EventCallbacks;
import jpos.events.*;

/**
 * MSR device control JUnit test.
 * <br>
 * Generated through jpos.build.controls.JavaPOSDeviceControlTestGenerator for JavaPOS version 1.16
 */
public class MSRTest {

    private static final String SERVICE_ALL_METHODS_THROWING_NPE = "MSRTestServiceAlwaysThrowingNPE";
    private static final String SERVICE_ALL_METHODS_RETHROWING_JPOSEXCEPTION = "MSRTestServiceRethrowingJposException";
    private static final String SERVICE_12 = "MSRTestService12";
    private static final String SERVICE_13 = "MSRTestService13";
    private static final String SERVICE_14 = "MSRTestService14";
    private static final String SERVICE_15 = "MSRTestService15";
    private static final String SERVICE_16 = "MSRTestService16";
    private static final String SERVICE_17 = "MSRTestService17";
    private static final String SERVICE_18 = "MSRTestService18";
    private static final String SERVICE_19 = "MSRTestService19";
    private static final String SERVICE_110 = "MSRTestService110";
    private static final String SERVICE_111 = "MSRTestService111";
    private static final String SERVICE_112 = "MSRTestService112";
    private static final String SERVICE_113 = "MSRTestService113";
    private static final String SERVICE_114 = "MSRTestService114";
    private static final String SERVICE_115 = "MSRTestService115";
    private static final String SERVICE_116 = "MSRTestService116";
    
    private static final String OPENNAME_WITH_NOT_EXISTING_SERVICECLASS = "OpenNameWithNotExistingServiceClass";
    private static final String OPENNAME_ALL_METHODS_THROWING_NPE = SERVICE_ALL_METHODS_THROWING_NPE;
    private static final String OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION = SERVICE_ALL_METHODS_RETHROWING_JPOSEXCEPTION;
    private static final String OPENNAME_THROWING_NPE_ON_GETDSVERSION = "CashDrawerTestServiceThrowingNPEOnGetDSVersion";
    
    private static final String OPENNAME_SERVICE_10 = SERVICE_12;
    private static final String OPENNAME_SERVICE_12 = SERVICE_12;
    private static final String OPENNAME_SERVICE_13 = SERVICE_13;
    private static final String OPENNAME_SERVICE_14 = SERVICE_14;
    private static final String OPENNAME_SERVICE_15 = SERVICE_15;
    private static final String OPENNAME_SERVICE_16 = SERVICE_16;
    private static final String OPENNAME_SERVICE_17 = SERVICE_17;
    private static final String OPENNAME_SERVICE_18 = SERVICE_18;
    private static final String OPENNAME_SERVICE_19 = SERVICE_19;
    private static final String OPENNAME_SERVICE_110 = SERVICE_110;
    private static final String OPENNAME_SERVICE_111 = SERVICE_111;
    private static final String OPENNAME_SERVICE_112 = SERVICE_112;
    private static final String OPENNAME_SERVICE_113 = SERVICE_113;
    private static final String OPENNAME_SERVICE_114 = SERVICE_114;
    private static final String OPENNAME_SERVICE_115 = SERVICE_115;
    private static final String OPENNAME_SERVICE_116 = SERVICE_116;
    
    private static final String OPENNAME_SERVICE_12_RETURNING_VERSION_TOO_LARGE = "MSRTestService12ReturningVersionTooLarge";
    private static final String OPENNAME_SERVICE_13_RETURNING_VERSION_TOO_LARGE = "MSRTestService13ReturningVersionTooLarge";
    private static final String OPENNAME_SERVICE_14_RETURNING_VERSION_TOO_LARGE = "MSRTestService14ReturningVersionTooLarge";
    private static final String OPENNAME_SERVICE_15_RETURNING_VERSION_TOO_LARGE = "MSRTestService15ReturningVersionTooLarge";
    private static final String OPENNAME_SERVICE_16_RETURNING_VERSION_TOO_LARGE = "MSRTestService16ReturningVersionTooLarge";
    private static final String OPENNAME_SERVICE_17_RETURNING_VERSION_TOO_LARGE = "MSRTestService17ReturningVersionTooLarge";
    private static final String OPENNAME_SERVICE_18_RETURNING_VERSION_TOO_LARGE = "MSRTestService18ReturningVersionTooLarge";
    private static final String OPENNAME_SERVICE_19_RETURNING_VERSION_TOO_LARGE = "MSRTestService19ReturningVersionTooLarge";
    private static final String OPENNAME_SERVICE_110_RETURNING_VERSION_TOO_LARGE = "MSRTestService110ReturningVersionTooLarge";
    private static final String OPENNAME_SERVICE_111_RETURNING_VERSION_TOO_LARGE = "MSRTestService111ReturningVersionTooLarge";
    private static final String OPENNAME_SERVICE_112_RETURNING_VERSION_TOO_LARGE = "MSRTestService112ReturningVersionTooLarge";
    private static final String OPENNAME_SERVICE_113_RETURNING_VERSION_TOO_LARGE = "MSRTestService113ReturningVersionTooLarge";
    private static final String OPENNAME_SERVICE_114_RETURNING_VERSION_TOO_LARGE = "MSRTestService114ReturningVersionTooLarge";
    private static final String OPENNAME_SERVICE_115_RETURNING_VERSION_TOO_LARGE = "MSRTestService115ReturningVersionTooLarge";
    
    /**
     * @throws java.lang.Exception
     */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        JposEntryRegistry registry = JposServiceLoader.getManager().getEntryRegistry();
        
        registry.addJposEntry(ControlsTestHelper.createJposEntry("MSR", OPENNAME_WITH_NOT_EXISTING_SERVICECLASS, "1.16", "NotExistingServiceClass"));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("MSR", OPENNAME_ALL_METHODS_THROWING_NPE, "1.16", SERVICE_ALL_METHODS_THROWING_NPE));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("MSR", OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION, "1.16", SERVICE_ALL_METHODS_RETHROWING_JPOSEXCEPTION));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("MSR", OPENNAME_THROWING_NPE_ON_GETDSVERSION, "1.116", SERVICE_116, new SimpleEntry.Prop("throwingNPEOnGetDSVersion", "")));
        
        registry.addJposEntry(ControlsTestHelper.createJposEntry("MSR", OPENNAME_SERVICE_12, "1.2", SERVICE_12));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("MSR", OPENNAME_SERVICE_13, "1.3", SERVICE_13));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("MSR", OPENNAME_SERVICE_14, "1.4", SERVICE_14));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("MSR", OPENNAME_SERVICE_15, "1.5", SERVICE_15));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("MSR", OPENNAME_SERVICE_16, "1.6", SERVICE_16));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("MSR", OPENNAME_SERVICE_17, "1.7", SERVICE_17));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("MSR", OPENNAME_SERVICE_18, "1.8", SERVICE_18));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("MSR", OPENNAME_SERVICE_19, "1.9", SERVICE_19));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("MSR", OPENNAME_SERVICE_110, "1.10", SERVICE_110));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("MSR", OPENNAME_SERVICE_111, "1.11", SERVICE_111));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("MSR", OPENNAME_SERVICE_112, "1.12", SERVICE_112));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("MSR", OPENNAME_SERVICE_113, "1.13", SERVICE_113));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("MSR", OPENNAME_SERVICE_114, "1.14", SERVICE_114));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("MSR", OPENNAME_SERVICE_115, "1.15", SERVICE_115));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("MSR", OPENNAME_SERVICE_116, "1.16", SERVICE_116));
        
        registry.addJposEntry(ControlsTestHelper.createJposEntry("MSR", OPENNAME_SERVICE_12_RETURNING_VERSION_TOO_LARGE, "1.2", SERVICE_12, new SimpleEntry.Prop("returnVersionTooLarge", "")));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("MSR", OPENNAME_SERVICE_13_RETURNING_VERSION_TOO_LARGE, "1.3", SERVICE_13, new SimpleEntry.Prop("returnVersionTooLarge", "")));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("MSR", OPENNAME_SERVICE_14_RETURNING_VERSION_TOO_LARGE, "1.4", SERVICE_14, new SimpleEntry.Prop("returnVersionTooLarge", "")));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("MSR", OPENNAME_SERVICE_15_RETURNING_VERSION_TOO_LARGE, "1.5", SERVICE_15, new SimpleEntry.Prop("returnVersionTooLarge", "")));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("MSR", OPENNAME_SERVICE_16_RETURNING_VERSION_TOO_LARGE, "1.6", SERVICE_16, new SimpleEntry.Prop("returnVersionTooLarge", "")));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("MSR", OPENNAME_SERVICE_17_RETURNING_VERSION_TOO_LARGE, "1.7", SERVICE_17, new SimpleEntry.Prop("returnVersionTooLarge", "")));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("MSR", OPENNAME_SERVICE_18_RETURNING_VERSION_TOO_LARGE, "1.8", SERVICE_18, new SimpleEntry.Prop("returnVersionTooLarge", "")));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("MSR", OPENNAME_SERVICE_19_RETURNING_VERSION_TOO_LARGE, "1.9", SERVICE_19, new SimpleEntry.Prop("returnVersionTooLarge", "")));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("MSR", OPENNAME_SERVICE_110_RETURNING_VERSION_TOO_LARGE, "1.10", SERVICE_110, new SimpleEntry.Prop("returnVersionTooLarge", "")));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("MSR", OPENNAME_SERVICE_111_RETURNING_VERSION_TOO_LARGE, "1.11", SERVICE_111, new SimpleEntry.Prop("returnVersionTooLarge", "")));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("MSR", OPENNAME_SERVICE_112_RETURNING_VERSION_TOO_LARGE, "1.12", SERVICE_112, new SimpleEntry.Prop("returnVersionTooLarge", "")));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("MSR", OPENNAME_SERVICE_113_RETURNING_VERSION_TOO_LARGE, "1.13", SERVICE_113, new SimpleEntry.Prop("returnVersionTooLarge", "")));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("MSR", OPENNAME_SERVICE_114_RETURNING_VERSION_TOO_LARGE, "1.14", SERVICE_114, new SimpleEntry.Prop("returnVersionTooLarge", "")));
        registry.addJposEntry(ControlsTestHelper.createJposEntry("MSR", OPENNAME_SERVICE_115_RETURNING_VERSION_TOO_LARGE, "1.15", SERVICE_115, new SimpleEntry.Prop("returnVersionTooLarge", "")));
        
    }
    
    /**
     * @throws java.lang.Exception
     */
    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        JposEntryRegistry registry = JposServiceLoader.getManager().getEntryRegistry();
        
        registry.removeJposEntry(OPENNAME_ALL_METHODS_THROWING_NPE);
        registry.removeJposEntry(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
        registry.removeJposEntry(OPENNAME_THROWING_NPE_ON_GETDSVERSION);
        
        registry.removeJposEntry(OPENNAME_SERVICE_12);
        registry.removeJposEntry(OPENNAME_SERVICE_13);
        registry.removeJposEntry(OPENNAME_SERVICE_14);
        registry.removeJposEntry(OPENNAME_SERVICE_15);
        registry.removeJposEntry(OPENNAME_SERVICE_16);
        registry.removeJposEntry(OPENNAME_SERVICE_17);
        registry.removeJposEntry(OPENNAME_SERVICE_18);
        registry.removeJposEntry(OPENNAME_SERVICE_19);
        registry.removeJposEntry(OPENNAME_SERVICE_110);
        registry.removeJposEntry(OPENNAME_SERVICE_111);
        registry.removeJposEntry(OPENNAME_SERVICE_112);
        registry.removeJposEntry(OPENNAME_SERVICE_113);
        registry.removeJposEntry(OPENNAME_SERVICE_114);
        registry.removeJposEntry(OPENNAME_SERVICE_115);
        registry.removeJposEntry(OPENNAME_SERVICE_116);
        
        registry.removeJposEntry(OPENNAME_SERVICE_12_RETURNING_VERSION_TOO_LARGE);
        registry.removeJposEntry(OPENNAME_SERVICE_13_RETURNING_VERSION_TOO_LARGE);
        registry.removeJposEntry(OPENNAME_SERVICE_14_RETURNING_VERSION_TOO_LARGE);
        registry.removeJposEntry(OPENNAME_SERVICE_15_RETURNING_VERSION_TOO_LARGE);
        registry.removeJposEntry(OPENNAME_SERVICE_16_RETURNING_VERSION_TOO_LARGE);
        registry.removeJposEntry(OPENNAME_SERVICE_17_RETURNING_VERSION_TOO_LARGE);
        registry.removeJposEntry(OPENNAME_SERVICE_18_RETURNING_VERSION_TOO_LARGE);
        registry.removeJposEntry(OPENNAME_SERVICE_19_RETURNING_VERSION_TOO_LARGE);
        registry.removeJposEntry(OPENNAME_SERVICE_110_RETURNING_VERSION_TOO_LARGE);
        registry.removeJposEntry(OPENNAME_SERVICE_111_RETURNING_VERSION_TOO_LARGE);
        registry.removeJposEntry(OPENNAME_SERVICE_112_RETURNING_VERSION_TOO_LARGE);
        registry.removeJposEntry(OPENNAME_SERVICE_113_RETURNING_VERSION_TOO_LARGE);
        registry.removeJposEntry(OPENNAME_SERVICE_114_RETURNING_VERSION_TOO_LARGE);
        registry.removeJposEntry(OPENNAME_SERVICE_115_RETURNING_VERSION_TOO_LARGE);

    }

    private MSR control;

    @Before
    public void setUp() throws Exception {
        this.control = new MSR();
    }

    @After
    public void tearDown() throws Exception {
        this.control = null;
    }

    /**
     * Test method for {@link jpos.MSR#createEventCallbacks()}.
     */
    @Test
    public final void testCreateEventCallbacks() {
        EventCallbacks callbacks = this.control.createEventCallbacks();
        assertThat(callbacks, is(notNullValue()));
    }
    
    @Test
    public void testOpenTwice() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            try {
                this.control.open(OPENNAME_SERVICE_116);
                fail("ILLEGAL exception expected but not thrown");
            }
            catch (JposException e) {
                assertThat(e.getErrorCode(), is(JposConst.JPOS_E_ILLEGAL));
            }
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testOpenNotExistingDevice() throws Exception {
        try {
            this.control.open("NOT_EXISTING_OPENNAME");
            fail("ILLEGAL exception expected but not thrown");
        }
        catch (JposException e) {
            assertThat(e.getErrorCode(), is(JposConst.JPOS_E_NOEXIST));
        }
    }
    
    @Test
    public void testOpenNotExistingServiceClass() throws Exception {
        try {
            this.control.open(OPENNAME_WITH_NOT_EXISTING_SERVICECLASS);
            fail("ILLEGAL exception expected but not thrown");
        }
        catch (JposException e) {
            assertThat(e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    @Test
    public void testGetStateBeforeOpen() throws Exception {
        assertThat(this.control.getState(), is(JposConst.JPOS_S_CLOSED));
    }
    
    @Test
    public void testGetStateAfterOpen() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            assertThat(this.control.getState(), is(JposConst.JPOS_S_IDLE));
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceServiceBeforeOpen() throws Exception {
        try {
            this.control.getDeviceServiceVersion();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public void testGetDeviceControlDescription() throws Exception {
        assertThat(this.control.getDeviceControlDescription(), is("JavaPOS MSR Device Control"));
    }
    
    @Test
    public void testDeviceControlVersion() throws Exception {
        assertThat(this.control.getDeviceControlVersion(), is(1016000));
    }
    
    @Test
    public final void testOpenFailsOnGetDeviceVersionWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_THROWING_NPE_ON_GETDSVERSION);
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetAccountNumberFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getAccountNumber();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetAdditionalSecurityInformationFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getAdditionalSecurityInformation();
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
    public final void testGetCapCardAuthenticationFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapCardAuthentication();
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
    public final void testGetCapDataEncryptionFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapDataEncryption();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCapDeviceAuthenticationFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapDeviceAuthentication();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCapISOFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapISO();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCapJISOneFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapJISOne();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCapJISTwoFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapJISTwo();
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
    public final void testGetCapTrackDataMaskingFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapTrackDataMasking();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCapTransmitSentinelsFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapTransmitSentinels();
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
    public final void testGetCapWritableTracksFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCapWritableTracks();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCardAuthenticationDataFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCardAuthenticationData();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCardAuthenticationDataLengthFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCardAuthenticationDataLength();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCardPropertyListFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCardPropertyList();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCardTypeFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCardType();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetCardTypeListFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getCardTypeList();
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
    public final void testGetDataEncryptionAlgorithmFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getDataEncryptionAlgorithm();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testSetDataEncryptionAlgorithmFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.setDataEncryptionAlgorithm(0);
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
    public final void testGetDecodeDataFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getDecodeData();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testSetDecodeDataFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.setDecodeData(true);
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetDeviceAuthenticatedFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getDeviceAuthenticated();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetDeviceAuthenticationProtocolFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getDeviceAuthenticationProtocol();
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
    public final void testGetEncodingMaxLengthFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getEncodingMaxLength();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetErrorReportingTypeFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getErrorReportingType();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testSetErrorReportingTypeFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.setErrorReportingType(0);
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetExpirationDateFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getExpirationDate();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetFirstNameFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getFirstName();
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
    public final void testGetMiddleInitialFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getMiddleInitial();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetParseDecodeDataFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getParseDecodeData();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testSetParseDecodeDataFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.setParseDecodeData(true);
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
    public final void testGetServiceCodeFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getServiceCode();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetSuffixFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getSuffix();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetSurnameFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getSurname();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetTitleFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getTitle();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetTrack1DataFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getTrack1Data();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetTrack1DiscretionaryDataFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getTrack1DiscretionaryData();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetTrack1EncryptedDataFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getTrack1EncryptedData();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetTrack1EncryptedDataLengthFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getTrack1EncryptedDataLength();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetTrack2DataFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getTrack2Data();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetTrack2DiscretionaryDataFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getTrack2DiscretionaryData();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetTrack2EncryptedDataFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getTrack2EncryptedData();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetTrack2EncryptedDataLengthFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getTrack2EncryptedDataLength();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetTrack3DataFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getTrack3Data();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetTrack3EncryptedDataFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getTrack3EncryptedData();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetTrack3EncryptedDataLengthFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getTrack3EncryptedDataLength();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetTrack4DataFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getTrack4Data();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetTrack4EncryptedDataFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getTrack4EncryptedData();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetTrack4EncryptedDataLengthFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getTrack4EncryptedDataLength();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetTracksToReadFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getTracksToRead();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testSetTracksToReadFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.setTracksToRead(0);
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetTracksToWriteFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getTracksToWrite();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testSetTracksToWriteFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.setTracksToWrite(0);
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetTransmitSentinelsFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getTransmitSentinels();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testSetTransmitSentinelsFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.setTransmitSentinels(true);
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetWriteCardTypeFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.getWriteCardType();
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testSetWriteCardTypeFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.setWriteCardType("");
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testAuthenticateDeviceFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.authenticateDevice(new byte[0]);
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
    public final void testClearInputPropertiesFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.clearInputProperties();
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
    public final void testDeauthenticateDeviceFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.deauthenticateDevice(new byte[0]);
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
    public final void testRetrieveCardPropertyFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.retrieveCardProperty("",new String[0]);
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testRetrieveDeviceAuthenticationDataFailsWithClosedExceptionBeforeOpenByteArrayArray() {
        try {
            this.control.retrieveDeviceAuthenticationData(new byte[0][0]);
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testRetrieveDeviceAuthenticationDataFailsWithClosedExceptionBeforeOpenByteArray() {
        try {
            this.control.retrieveDeviceAuthenticationData(new byte[0]);
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
    public final void testUpdateKeyFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.updateKey("","");
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
    public final void testWriteTracksFailsWithClosedExceptionBeforeOpen() {
        try {
            this.control.writeTracks(new byte[0][0],0);
            fail("CLOSED JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("CLOSED JposException expected but a different was thrown: " + e.getErrorCode(), e.getErrorCode(), is(JposConst.JPOS_E_CLOSED));
        }
    }
    
    @Test
    public final void testGetAccountNumberFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getAccountNumber();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetAdditionalSecurityInformationFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getAdditionalSecurityInformation();
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
    public final void testGetCapCardAuthenticationFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapCardAuthentication();
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
    public final void testGetCapDataEncryptionFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapDataEncryption();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCapDeviceAuthenticationFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapDeviceAuthentication();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCapISOFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapISO();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCapJISOneFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapJISOne();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCapJISTwoFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapJISTwo();
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
    public final void testGetCapTrackDataMaskingFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapTrackDataMasking();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCapTransmitSentinelsFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapTransmitSentinels();
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
    public final void testGetCapWritableTracksFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCapWritableTracks();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCardAuthenticationDataFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCardAuthenticationData();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCardAuthenticationDataLengthFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCardAuthenticationDataLength();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCardPropertyListFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCardPropertyList();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCardTypeFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCardType();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetCardTypeListFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getCardTypeList();
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
    public final void testGetDataEncryptionAlgorithmFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getDataEncryptionAlgorithm();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testSetDataEncryptionAlgorithmFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.setDataEncryptionAlgorithm(0);
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
    public final void testGetDecodeDataFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getDecodeData();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testSetDecodeDataFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.setDecodeData(true);
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetDeviceAuthenticatedFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getDeviceAuthenticated();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetDeviceAuthenticationProtocolFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getDeviceAuthenticationProtocol();
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
    public final void testGetEncodingMaxLengthFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getEncodingMaxLength();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetErrorReportingTypeFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getErrorReportingType();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testSetErrorReportingTypeFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.setErrorReportingType(0);
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetExpirationDateFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getExpirationDate();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetFirstNameFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getFirstName();
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
    public final void testGetMiddleInitialFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getMiddleInitial();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetParseDecodeDataFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getParseDecodeData();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testSetParseDecodeDataFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.setParseDecodeData(true);
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
    public final void testGetServiceCodeFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getServiceCode();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetSuffixFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getSuffix();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetSurnameFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getSurname();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetTitleFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getTitle();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetTrack1DataFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getTrack1Data();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetTrack1DiscretionaryDataFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getTrack1DiscretionaryData();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetTrack1EncryptedDataFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getTrack1EncryptedData();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetTrack1EncryptedDataLengthFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getTrack1EncryptedDataLength();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetTrack2DataFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getTrack2Data();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetTrack2DiscretionaryDataFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getTrack2DiscretionaryData();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetTrack2EncryptedDataFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getTrack2EncryptedData();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetTrack2EncryptedDataLengthFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getTrack2EncryptedDataLength();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetTrack3DataFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getTrack3Data();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetTrack3EncryptedDataFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getTrack3EncryptedData();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetTrack3EncryptedDataLengthFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getTrack3EncryptedDataLength();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetTrack4DataFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getTrack4Data();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetTrack4EncryptedDataFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getTrack4EncryptedData();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetTrack4EncryptedDataLengthFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getTrack4EncryptedDataLength();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetTracksToReadFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getTracksToRead();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testSetTracksToReadFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.setTracksToRead(0);
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetTracksToWriteFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getTracksToWrite();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testSetTracksToWriteFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.setTracksToWrite(0);
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetTransmitSentinelsFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getTransmitSentinels();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testSetTransmitSentinelsFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.setTransmitSentinels(true);
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetWriteCardTypeFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.getWriteCardType();
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testSetWriteCardTypeFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.setWriteCardType("");
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testAuthenticateDeviceFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.authenticateDevice(new byte[0]);
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
    public final void testClearInputPropertiesFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.clearInputProperties();
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
    public final void testDeauthenticateDeviceFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.deauthenticateDevice(new byte[0]);
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
    public final void testRetrieveCardPropertyFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.retrieveCardProperty("",new String[0]);
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testRetrieveDeviceAuthenticationDataFailsWithFailureExceptionOnNPEByteArrayArray() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.retrieveDeviceAuthenticationData(new byte[0][0]);
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testRetrieveDeviceAuthenticationDataFailsWithFailureExceptionOnNPEByteArray() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.retrieveDeviceAuthenticationData(new byte[0]);
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
    public final void testUpdateKeyFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.updateKey("","");
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
    public final void testWriteTracksFailsWithFailureExceptionOnNPE() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_THROWING_NPE);
            this.control.writeTracks(new byte[0][0],0);
            fail("FAILURE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("FAILURE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_FAILURE));
            assertThat(e.getOrigException(), is(instanceOf(NullPointerException.class)));
        }
    }
    
    @Test
    public final void testGetAccountNumberRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getAccountNumber();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetAdditionalSecurityInformationRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getAdditionalSecurityInformation();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetAutoDisableRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getAutoDisable();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testSetAutoDisableRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.setAutoDisable(true);
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetCapCardAuthenticationRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getCapCardAuthentication();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetCapCompareFirmwareVersionRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getCapCompareFirmwareVersion();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetCapDataEncryptionRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getCapDataEncryption();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetCapDeviceAuthenticationRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getCapDeviceAuthentication();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetCapISORethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getCapISO();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetCapJISOneRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getCapJISOne();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetCapJISTwoRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getCapJISTwo();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetCapPowerReportingRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getCapPowerReporting();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetCapStatisticsReportingRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getCapStatisticsReporting();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetCapTrackDataMaskingRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getCapTrackDataMasking();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetCapTransmitSentinelsRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getCapTransmitSentinels();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetCapUpdateFirmwareRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getCapUpdateFirmware();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetCapUpdateStatisticsRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getCapUpdateStatistics();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetCapWritableTracksRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getCapWritableTracks();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetCardAuthenticationDataRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getCardAuthenticationData();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetCardAuthenticationDataLengthRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getCardAuthenticationDataLength();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetCardPropertyListRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getCardPropertyList();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetCardTypeRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getCardType();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetCardTypeListRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getCardTypeList();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetCheckHealthTextRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getCheckHealthText();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetClaimedRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getClaimed();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetDataCountRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getDataCount();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetDataEncryptionAlgorithmRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getDataEncryptionAlgorithm();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testSetDataEncryptionAlgorithmRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.setDataEncryptionAlgorithm(0);
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetDataEventEnabledRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getDataEventEnabled();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testSetDataEventEnabledRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.setDataEventEnabled(true);
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetDecodeDataRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getDecodeData();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testSetDecodeDataRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.setDecodeData(true);
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetDeviceAuthenticatedRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getDeviceAuthenticated();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetDeviceAuthenticationProtocolRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getDeviceAuthenticationProtocol();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetDeviceEnabledRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getDeviceEnabled();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testSetDeviceEnabledRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.setDeviceEnabled(true);
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetDeviceServiceDescriptionRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getDeviceServiceDescription();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetEncodingMaxLengthRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getEncodingMaxLength();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetErrorReportingTypeRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getErrorReportingType();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testSetErrorReportingTypeRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.setErrorReportingType(0);
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetExpirationDateRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getExpirationDate();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetFirstNameRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getFirstName();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetFreezeEventsRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getFreezeEvents();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testSetFreezeEventsRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.setFreezeEvents(true);
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetMiddleInitialRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getMiddleInitial();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetParseDecodeDataRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getParseDecodeData();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testSetParseDecodeDataRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.setParseDecodeData(true);
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetPhysicalDeviceDescriptionRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getPhysicalDeviceDescription();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetPhysicalDeviceNameRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getPhysicalDeviceName();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetPowerNotifyRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getPowerNotify();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testSetPowerNotifyRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.setPowerNotify(0);
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetPowerStateRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getPowerState();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetServiceCodeRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getServiceCode();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetSuffixRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getSuffix();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetSurnameRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getSurname();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetTitleRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getTitle();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetTrack1DataRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getTrack1Data();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetTrack1DiscretionaryDataRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getTrack1DiscretionaryData();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetTrack1EncryptedDataRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getTrack1EncryptedData();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetTrack1EncryptedDataLengthRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getTrack1EncryptedDataLength();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetTrack2DataRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getTrack2Data();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetTrack2DiscretionaryDataRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getTrack2DiscretionaryData();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetTrack2EncryptedDataRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getTrack2EncryptedData();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetTrack2EncryptedDataLengthRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getTrack2EncryptedDataLength();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetTrack3DataRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getTrack3Data();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetTrack3EncryptedDataRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getTrack3EncryptedData();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetTrack3EncryptedDataLengthRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getTrack3EncryptedDataLength();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetTrack4DataRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getTrack4Data();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetTrack4EncryptedDataRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getTrack4EncryptedData();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetTrack4EncryptedDataLengthRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getTrack4EncryptedDataLength();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetTracksToReadRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getTracksToRead();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testSetTracksToReadRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.setTracksToRead(0);
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetTracksToWriteRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getTracksToWrite();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testSetTracksToWriteRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.setTracksToWrite(0);
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetTransmitSentinelsRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getTransmitSentinels();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testSetTransmitSentinelsRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.setTransmitSentinels(true);
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetWriteCardTypeRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.getWriteCardType();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testSetWriteCardTypeRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.setWriteCardType("");
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testAuthenticateDeviceRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.authenticateDevice(new byte[0]);
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testCheckHealthRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.checkHealth(0);
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testClaimRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.claim(0);
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testClearInputRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.clearInput();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testClearInputPropertiesRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.clearInputProperties();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testCloseRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.close();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testCompareFirmwareVersionRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.compareFirmwareVersion("",new int[0]);
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testDeauthenticateDeviceRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.deauthenticateDevice(new byte[0]);
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testDirectIORethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.directIO(0,new int[0],new Object());
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testReleaseRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.release();
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testResetStatisticsRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.resetStatistics("");
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testRetrieveCardPropertyRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.retrieveCardProperty("",new String[0]);
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testRetrieveDeviceAuthenticationDataByteArrayArrayRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.retrieveDeviceAuthenticationData(new byte[0][0]);
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testRetrieveDeviceAuthenticationDataByteArrayRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.retrieveDeviceAuthenticationData(new byte[0]);
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testRetrieveStatisticsRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.retrieveStatistics(new String[0]);
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testUpdateFirmwareRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.updateFirmware("");
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testUpdateKeyRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.updateKey("","");
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testUpdateStatisticsRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.updateStatistics("");
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testWriteTracksRethrowsJposException() {
        try {
            this.control.open(OPENNAME_ALL_METHODS_RETHROWING_JPOSEXCEPTION);
            this.control.writeTracks(new byte[0][0],0);
            fail("JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("JposException expected but a different was thrown: " + e.getErrorCode(),
                    e.getErrorCode(), is(JposConst.JPOS_E_NOHARDWARE));
            assertThat(e.getErrorCodeExtended(), is(Integer.MAX_VALUE));
            assertThat(e.getMessage(), is("hardware error"));
        }
    }
    
    @Test
    public final void testGetDeviceVersion12() {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            assertThat(this.control.getDeviceServiceVersion(), is(1002000));
        }
        catch (JposException e) {
            fail("MSR.getDeviceServiceVersion() failed with " + e.getMessage());
        }
    }
    
    @Test
    public final void testGetDeviceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            assertThat(this.control.getDeviceServiceVersion(), is(1003000));
        }
        catch (JposException e) {
            fail("MSR.getDeviceServiceVersion() failed with " + e.getMessage());
        }
    }
    
    @Test
    public final void testGetDeviceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            assertThat(this.control.getDeviceServiceVersion(), is(1004000));
        }
        catch (JposException e) {
            fail("MSR.getDeviceServiceVersion() failed with " + e.getMessage());
        }
    }
    
    @Test
    public final void testGetDeviceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            assertThat(this.control.getDeviceServiceVersion(), is(1005000));
        }
        catch (JposException e) {
            fail("MSR.getDeviceServiceVersion() failed with " + e.getMessage());
        }
    }
    
    @Test
    public final void testGetDeviceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            assertThat(this.control.getDeviceServiceVersion(), is(1006000));
        }
        catch (JposException e) {
            fail("MSR.getDeviceServiceVersion() failed with " + e.getMessage());
        }
    }
    
    @Test
    public final void testGetDeviceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            assertThat(this.control.getDeviceServiceVersion(), is(1007000));
        }
        catch (JposException e) {
            fail("MSR.getDeviceServiceVersion() failed with " + e.getMessage());
        }
    }
    
    @Test
    public final void testGetDeviceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            assertThat(this.control.getDeviceServiceVersion(), is(1008000));
        }
        catch (JposException e) {
            fail("MSR.getDeviceServiceVersion() failed with " + e.getMessage());
        }
    }
    
    @Test
    public final void testGetDeviceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            assertThat(this.control.getDeviceServiceVersion(), is(1009000));
        }
        catch (JposException e) {
            fail("MSR.getDeviceServiceVersion() failed with " + e.getMessage());
        }
    }
    
    @Test
    public final void testGetDeviceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            assertThat(this.control.getDeviceServiceVersion(), is(1010000));
        }
        catch (JposException e) {
            fail("MSR.getDeviceServiceVersion() failed with " + e.getMessage());
        }
    }
    
    @Test
    public final void testGetDeviceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            assertThat(this.control.getDeviceServiceVersion(), is(1011000));
        }
        catch (JposException e) {
            fail("MSR.getDeviceServiceVersion() failed with " + e.getMessage());
        }
    }
    
    @Test
    public final void testGetDeviceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            assertThat(this.control.getDeviceServiceVersion(), is(1012000));
        }
        catch (JposException e) {
            fail("MSR.getDeviceServiceVersion() failed with " + e.getMessage());
        }
    }
    
    @Test
    public final void testGetDeviceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            assertThat(this.control.getDeviceServiceVersion(), is(1013000));
        }
        catch (JposException e) {
            fail("MSR.getDeviceServiceVersion() failed with " + e.getMessage());
        }
    }
    
    @Test
    public final void testGetDeviceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            assertThat(this.control.getDeviceServiceVersion(), is(1014000));
        }
        catch (JposException e) {
            fail("MSR.getDeviceServiceVersion() failed with " + e.getMessage());
        }
    }
    
    @Test
    public final void testGetDeviceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            assertThat(this.control.getDeviceServiceVersion(), is(1015000));
        }
        catch (JposException e) {
            fail("MSR.getDeviceServiceVersion() failed with " + e.getMessage());
        }
    }
    
    @Test
    public final void testGetDeviceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            assertThat(this.control.getDeviceServiceVersion(), is(1016000));
        }
        catch (JposException e) {
            fail("MSR.getDeviceServiceVersion() failed with " + e.getMessage());
        }
    }
    
    @Test
    public void testOpenOnService12ReturningVersionTooLarge() {
        try {
            this.control.open(OPENNAME_SERVICE_12_RETURNING_VERSION_TOO_LARGE);
            fail("NOSERVICE exception expected but not thrown");
        }
        catch (JposException e) {
            assertThat(e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    @Test
    public void testOpenOnService13ReturningVersionTooLarge() {
        try {
            this.control.open(OPENNAME_SERVICE_13_RETURNING_VERSION_TOO_LARGE);
            fail("NOSERVICE exception expected but not thrown");
        }
        catch (JposException e) {
            assertThat(e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    @Test
    public void testOpenOnService14ReturningVersionTooLarge() {
        try {
            this.control.open(OPENNAME_SERVICE_14_RETURNING_VERSION_TOO_LARGE);
            fail("NOSERVICE exception expected but not thrown");
        }
        catch (JposException e) {
            assertThat(e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    @Test
    public void testOpenOnService15ReturningVersionTooLarge() {
        try {
            this.control.open(OPENNAME_SERVICE_15_RETURNING_VERSION_TOO_LARGE);
            fail("NOSERVICE exception expected but not thrown");
        }
        catch (JposException e) {
            assertThat(e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    @Test
    public void testOpenOnService16ReturningVersionTooLarge() {
        try {
            this.control.open(OPENNAME_SERVICE_16_RETURNING_VERSION_TOO_LARGE);
            fail("NOSERVICE exception expected but not thrown");
        }
        catch (JposException e) {
            assertThat(e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    @Test
    public void testOpenOnService17ReturningVersionTooLarge() {
        try {
            this.control.open(OPENNAME_SERVICE_17_RETURNING_VERSION_TOO_LARGE);
            fail("NOSERVICE exception expected but not thrown");
        }
        catch (JposException e) {
            assertThat(e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    @Test
    public void testOpenOnService18ReturningVersionTooLarge() {
        try {
            this.control.open(OPENNAME_SERVICE_18_RETURNING_VERSION_TOO_LARGE);
            fail("NOSERVICE exception expected but not thrown");
        }
        catch (JposException e) {
            assertThat(e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    @Test
    public void testOpenOnService19ReturningVersionTooLarge() {
        try {
            this.control.open(OPENNAME_SERVICE_19_RETURNING_VERSION_TOO_LARGE);
            fail("NOSERVICE exception expected but not thrown");
        }
        catch (JposException e) {
            assertThat(e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    @Test
    public void testOpenOnService110ReturningVersionTooLarge() {
        try {
            this.control.open(OPENNAME_SERVICE_110_RETURNING_VERSION_TOO_LARGE);
            fail("NOSERVICE exception expected but not thrown");
        }
        catch (JposException e) {
            assertThat(e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    @Test
    public void testOpenOnService111ReturningVersionTooLarge() {
        try {
            this.control.open(OPENNAME_SERVICE_111_RETURNING_VERSION_TOO_LARGE);
            fail("NOSERVICE exception expected but not thrown");
        }
        catch (JposException e) {
            assertThat(e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    @Test
    public void testOpenOnService112ReturningVersionTooLarge() {
        try {
            this.control.open(OPENNAME_SERVICE_112_RETURNING_VERSION_TOO_LARGE);
            fail("NOSERVICE exception expected but not thrown");
        }
        catch (JposException e) {
            assertThat(e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    @Test
    public void testOpenOnService113ReturningVersionTooLarge() {
        try {
            this.control.open(OPENNAME_SERVICE_113_RETURNING_VERSION_TOO_LARGE);
            fail("NOSERVICE exception expected but not thrown");
        }
        catch (JposException e) {
            assertThat(e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    @Test
    public void testOpenOnService114ReturningVersionTooLarge() {
        try {
            this.control.open(OPENNAME_SERVICE_114_RETURNING_VERSION_TOO_LARGE);
            fail("NOSERVICE exception expected but not thrown");
        }
        catch (JposException e) {
            assertThat(e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    @Test
    public void testOpenOnService115ReturningVersionTooLarge() {
        try {
            this.control.open(OPENNAME_SERVICE_115_RETURNING_VERSION_TOO_LARGE);
            fail("NOSERVICE exception expected but not thrown");
        }
        catch (JposException e) {
            assertThat(e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    @Test
    public void testGetAccountNumberCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.getAccountNumber();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAccountNumberCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getAccountNumber();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAccountNumberCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getAccountNumber();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAccountNumberCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getAccountNumber();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAccountNumberCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getAccountNumber();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAccountNumberCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getAccountNumber();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAccountNumberCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getAccountNumber();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAccountNumberCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getAccountNumber();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAccountNumberCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getAccountNumber();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAccountNumberCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getAccountNumber();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAccountNumberCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getAccountNumber();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAccountNumberCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getAccountNumber();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAccountNumberCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getAccountNumber();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAccountNumberCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.getAccountNumber();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAccountNumberCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.getAccountNumber();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetAdditionalSecurityInformationFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getAdditionalSecurityInformation();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetAdditionalSecurityInformationCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getAdditionalSecurityInformation();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAdditionalSecurityInformationCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getAdditionalSecurityInformation();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAdditionalSecurityInformationCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getAdditionalSecurityInformation();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAdditionalSecurityInformationCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.getAdditionalSecurityInformation();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAdditionalSecurityInformationCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.getAdditionalSecurityInformation();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetAutoDisableCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.getAutoDisable();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAutoDisableCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getAutoDisable();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAutoDisableCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getAutoDisable();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAutoDisableCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getAutoDisable();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAutoDisableCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getAutoDisable();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAutoDisableCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getAutoDisable();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAutoDisableCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getAutoDisable();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAutoDisableCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getAutoDisable();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAutoDisableCalledOnServiceVersion110() {
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
    public void testGetAutoDisableCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.getAutoDisable();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetAutoDisableCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.getAutoDisable();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetAutoDisableCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.setAutoDisable(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetAutoDisableCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.setAutoDisable(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetAutoDisableCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.setAutoDisable(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetAutoDisableCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.setAutoDisable(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetAutoDisableCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.setAutoDisable(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetAutoDisableCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.setAutoDisable(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetAutoDisableCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.setAutoDisable(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetAutoDisableCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.setAutoDisable(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetAutoDisableCalledOnServiceVersion110() {
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
    public void testSetAutoDisableCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.setAutoDisable(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetAutoDisableCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.setAutoDisable(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapCardAuthenticationFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getCapCardAuthentication();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetCapCardAuthenticationCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCapCardAuthentication();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapCardAuthenticationCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapCardAuthentication();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapCardAuthenticationCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapCardAuthentication();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapCardAuthenticationCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.getCapCardAuthentication();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapCardAuthenticationCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.getCapCardAuthentication();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetCapCompareFirmwareVersionFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getCapCompareFirmwareVersion();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetCapCompareFirmwareVersionCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getCapCompareFirmwareVersion();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapCompareFirmwareVersionCalledOnServiceVersion110() {
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
    public void testGetCapCompareFirmwareVersionCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.getCapCompareFirmwareVersion();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapCompareFirmwareVersionCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.getCapCompareFirmwareVersion();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetCapDataEncryptionFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getCapDataEncryption();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetCapDataEncryptionCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCapDataEncryption();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapDataEncryptionCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapDataEncryption();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapDataEncryptionCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapDataEncryption();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapDataEncryptionCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.getCapDataEncryption();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapDataEncryptionCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.getCapDataEncryption();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetCapDeviceAuthenticationFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getCapDeviceAuthentication();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetCapDeviceAuthenticationCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCapDeviceAuthentication();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapDeviceAuthenticationCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapDeviceAuthentication();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapDeviceAuthenticationCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapDeviceAuthentication();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapDeviceAuthenticationCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.getCapDeviceAuthentication();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapDeviceAuthenticationCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.getCapDeviceAuthentication();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetCapISOCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.getCapISO();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapISOCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getCapISO();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapISOCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getCapISO();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapISOCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getCapISO();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapISOCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getCapISO();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapISOCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getCapISO();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapISOCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getCapISO();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapISOCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getCapISO();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapISOCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getCapISO();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapISOCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getCapISO();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapISOCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCapISO();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapISOCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapISO();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapISOCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapISO();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapISOCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.getCapISO();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapISOCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.getCapISO();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetCapJISOneCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.getCapJISOne();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapJISOneCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getCapJISOne();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapJISOneCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getCapJISOne();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapJISOneCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getCapJISOne();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapJISOneCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getCapJISOne();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapJISOneCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getCapJISOne();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapJISOneCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getCapJISOne();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapJISOneCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getCapJISOne();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapJISOneCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getCapJISOne();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapJISOneCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getCapJISOne();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapJISOneCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCapJISOne();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapJISOneCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapJISOne();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapJISOneCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapJISOne();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapJISOneCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.getCapJISOne();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapJISOneCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.getCapJISOne();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetCapJISTwoCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.getCapJISTwo();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapJISTwoCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getCapJISTwo();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapJISTwoCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getCapJISTwo();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapJISTwoCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getCapJISTwo();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapJISTwoCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getCapJISTwo();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapJISTwoCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getCapJISTwo();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapJISTwoCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getCapJISTwo();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapJISTwoCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getCapJISTwo();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapJISTwoCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getCapJISTwo();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapJISTwoCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getCapJISTwo();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapJISTwoCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCapJISTwo();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapJISTwoCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapJISTwo();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapJISTwoCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapJISTwo();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapJISTwoCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.getCapJISTwo();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapJISTwoCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.getCapJISTwo();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetCapPowerReportingFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.getCapPowerReporting();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetCapPowerReportingCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getCapPowerReporting();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapPowerReportingCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getCapPowerReporting();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapPowerReportingCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getCapPowerReporting();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapPowerReportingCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getCapPowerReporting();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapPowerReportingCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getCapPowerReporting();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapPowerReportingCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getCapPowerReporting();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapPowerReportingCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getCapPowerReporting();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapPowerReportingCalledOnServiceVersion110() {
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
    public void testGetCapPowerReportingCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.getCapPowerReporting();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapPowerReportingCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.getCapPowerReporting();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetCapStatisticsReportingFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getCapStatisticsReporting();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetCapStatisticsReportingCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getCapStatisticsReporting();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapStatisticsReportingCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getCapStatisticsReporting();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapStatisticsReportingCalledOnServiceVersion110() {
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
    public void testGetCapStatisticsReportingCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.getCapStatisticsReporting();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapStatisticsReportingCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.getCapStatisticsReporting();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetCapTrackDataMaskingFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getCapTrackDataMasking();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetCapTrackDataMaskingCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCapTrackDataMasking();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapTrackDataMaskingCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapTrackDataMasking();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapTrackDataMaskingCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapTrackDataMasking();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapTrackDataMaskingCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.getCapTrackDataMasking();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapTrackDataMaskingCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.getCapTrackDataMasking();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetCapTransmitSentinelsFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getCapTransmitSentinels();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetCapTransmitSentinelsCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getCapTransmitSentinels();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapTransmitSentinelsCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getCapTransmitSentinels();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapTransmitSentinelsCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getCapTransmitSentinels();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapTransmitSentinelsCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getCapTransmitSentinels();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapTransmitSentinelsCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getCapTransmitSentinels();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapTransmitSentinelsCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getCapTransmitSentinels();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapTransmitSentinelsCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getCapTransmitSentinels();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapTransmitSentinelsCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCapTransmitSentinels();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapTransmitSentinelsCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapTransmitSentinels();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapTransmitSentinelsCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapTransmitSentinels();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapTransmitSentinelsCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.getCapTransmitSentinels();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapTransmitSentinelsCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.getCapTransmitSentinels();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetCapUpdateFirmwareFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getCapUpdateFirmware();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetCapUpdateFirmwareCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getCapUpdateFirmware();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapUpdateFirmwareCalledOnServiceVersion110() {
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
    public void testGetCapUpdateFirmwareCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.getCapUpdateFirmware();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapUpdateFirmwareCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.getCapUpdateFirmware();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetCapUpdateStatisticsFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getCapUpdateStatistics();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetCapUpdateStatisticsCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getCapUpdateStatistics();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapUpdateStatisticsCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getCapUpdateStatistics();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapUpdateStatisticsCalledOnServiceVersion110() {
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
    public void testGetCapUpdateStatisticsCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.getCapUpdateStatistics();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapUpdateStatisticsCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.getCapUpdateStatistics();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetCapWritableTracksFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getCapWritableTracks();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetCapWritableTracksCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getCapWritableTracks();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapWritableTracksCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getCapWritableTracks();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapWritableTracksCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCapWritableTracks();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapWritableTracksCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCapWritableTracks();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapWritableTracksCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCapWritableTracks();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapWritableTracksCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.getCapWritableTracks();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCapWritableTracksCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.getCapWritableTracks();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetCardAuthenticationDataFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getCardAuthenticationData();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetCardAuthenticationDataCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCardAuthenticationData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCardAuthenticationDataCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCardAuthenticationData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCardAuthenticationDataCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCardAuthenticationData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCardAuthenticationDataCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.getCardAuthenticationData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCardAuthenticationDataCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.getCardAuthenticationData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetCardAuthenticationDataLengthFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getCardAuthenticationDataLength();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetCardAuthenticationDataLengthCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCardAuthenticationDataLength();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCardAuthenticationDataLengthCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCardAuthenticationDataLength();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCardAuthenticationDataLengthCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCardAuthenticationDataLength();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCardAuthenticationDataLengthCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.getCardAuthenticationDataLength();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCardAuthenticationDataLengthCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.getCardAuthenticationDataLength();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetCardPropertyListFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getCardPropertyList();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetCardPropertyListCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCardPropertyList();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCardPropertyListCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCardPropertyList();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCardPropertyListCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCardPropertyList();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCardPropertyListCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.getCardPropertyList();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCardPropertyListCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.getCardPropertyList();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetCardTypeFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getCardType();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetCardTypeCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCardType();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCardTypeCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCardType();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCardTypeCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCardType();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCardTypeCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.getCardType();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCardTypeCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.getCardType();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetCardTypeListFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getCardTypeList();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetCardTypeListCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getCardTypeList();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCardTypeListCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getCardTypeList();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCardTypeListCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getCardTypeList();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCardTypeListCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.getCardTypeList();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCardTypeListCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.getCardTypeList();
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
    public void testGetCheckHealthTextCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getCheckHealthText();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCheckHealthTextCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getCheckHealthText();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCheckHealthTextCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getCheckHealthText();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCheckHealthTextCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getCheckHealthText();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCheckHealthTextCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getCheckHealthText();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCheckHealthTextCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getCheckHealthText();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCheckHealthTextCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getCheckHealthText();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCheckHealthTextCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
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
    public void testGetCheckHealthTextCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.getCheckHealthText();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetCheckHealthTextCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
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
    public void testGetClaimedCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getClaimed();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetClaimedCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getClaimed();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetClaimedCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getClaimed();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetClaimedCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getClaimed();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetClaimedCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getClaimed();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetClaimedCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getClaimed();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetClaimedCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getClaimed();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetClaimedCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
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
    public void testGetClaimedCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.getClaimed();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetClaimedCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.getClaimed();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetDataCountCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.getDataCount();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataCountCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getDataCount();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataCountCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getDataCount();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataCountCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getDataCount();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataCountCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getDataCount();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataCountCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getDataCount();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataCountCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getDataCount();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataCountCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getDataCount();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataCountCalledOnServiceVersion110() {
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
    public void testGetDataCountCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.getDataCount();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataCountCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.getDataCount();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetDataEncryptionAlgorithmFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getDataEncryptionAlgorithm();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetDataEncryptionAlgorithmCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getDataEncryptionAlgorithm();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataEncryptionAlgorithmCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getDataEncryptionAlgorithm();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataEncryptionAlgorithmCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getDataEncryptionAlgorithm();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataEncryptionAlgorithmCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.getDataEncryptionAlgorithm();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataEncryptionAlgorithmCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.getDataEncryptionAlgorithm();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDataEncryptionAlgorithmFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.setDataEncryptionAlgorithm(0);
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    @Test
    public void testSetDataEncryptionAlgorithmCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.setDataEncryptionAlgorithm(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDataEncryptionAlgorithmCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.setDataEncryptionAlgorithm(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDataEncryptionAlgorithmCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.setDataEncryptionAlgorithm(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDataEncryptionAlgorithmCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.setDataEncryptionAlgorithm(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDataEncryptionAlgorithmCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.setDataEncryptionAlgorithm(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetDataEventEnabledCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.getDataEventEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataEventEnabledCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getDataEventEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataEventEnabledCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getDataEventEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataEventEnabledCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getDataEventEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataEventEnabledCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getDataEventEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataEventEnabledCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getDataEventEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataEventEnabledCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getDataEventEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataEventEnabledCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getDataEventEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataEventEnabledCalledOnServiceVersion110() {
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
    public void testGetDataEventEnabledCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.getDataEventEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDataEventEnabledCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.getDataEventEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDataEventEnabledCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.setDataEventEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDataEventEnabledCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.setDataEventEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDataEventEnabledCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.setDataEventEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDataEventEnabledCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.setDataEventEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDataEventEnabledCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.setDataEventEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDataEventEnabledCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.setDataEventEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDataEventEnabledCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.setDataEventEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDataEventEnabledCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.setDataEventEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDataEventEnabledCalledOnServiceVersion110() {
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
    public void testSetDataEventEnabledCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.setDataEventEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDataEventEnabledCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.setDataEventEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetDecodeDataCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.getDecodeData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDecodeDataCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getDecodeData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDecodeDataCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getDecodeData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDecodeDataCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getDecodeData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDecodeDataCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getDecodeData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDecodeDataCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getDecodeData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDecodeDataCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getDecodeData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDecodeDataCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getDecodeData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDecodeDataCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getDecodeData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDecodeDataCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getDecodeData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDecodeDataCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getDecodeData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDecodeDataCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getDecodeData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDecodeDataCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getDecodeData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDecodeDataCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.getDecodeData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDecodeDataCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.getDecodeData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDecodeDataCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.setDecodeData(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDecodeDataCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.setDecodeData(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDecodeDataCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.setDecodeData(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDecodeDataCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.setDecodeData(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDecodeDataCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.setDecodeData(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDecodeDataCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.setDecodeData(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDecodeDataCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.setDecodeData(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDecodeDataCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.setDecodeData(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDecodeDataCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.setDecodeData(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDecodeDataCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.setDecodeData(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDecodeDataCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.setDecodeData(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDecodeDataCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.setDecodeData(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDecodeDataCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.setDecodeData(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDecodeDataCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.setDecodeData(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDecodeDataCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.setDecodeData(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceAuthenticatedFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getDeviceAuthenticated();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetDeviceAuthenticatedCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getDeviceAuthenticated();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceAuthenticatedCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getDeviceAuthenticated();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceAuthenticatedCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getDeviceAuthenticated();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceAuthenticatedCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.getDeviceAuthenticated();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceAuthenticatedCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.getDeviceAuthenticated();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetDeviceAuthenticationProtocolFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getDeviceAuthenticationProtocol();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetDeviceAuthenticationProtocolCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getDeviceAuthenticationProtocol();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceAuthenticationProtocolCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getDeviceAuthenticationProtocol();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceAuthenticationProtocolCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getDeviceAuthenticationProtocol();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceAuthenticationProtocolCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.getDeviceAuthenticationProtocol();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceAuthenticationProtocolCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.getDeviceAuthenticationProtocol();
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
    public void testGetDeviceEnabledCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getDeviceEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceEnabledCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getDeviceEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceEnabledCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getDeviceEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceEnabledCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getDeviceEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceEnabledCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getDeviceEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceEnabledCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getDeviceEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceEnabledCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getDeviceEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceEnabledCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
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
    public void testGetDeviceEnabledCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.getDeviceEnabled();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceEnabledCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
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
    public void testSetDeviceEnabledCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.setDeviceEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDeviceEnabledCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.setDeviceEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDeviceEnabledCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.setDeviceEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDeviceEnabledCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.setDeviceEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDeviceEnabledCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.setDeviceEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDeviceEnabledCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.setDeviceEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDeviceEnabledCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.setDeviceEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDeviceEnabledCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
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
    public void testSetDeviceEnabledCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.setDeviceEnabled(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetDeviceEnabledCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
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
    public void testGetDeviceServiceDescriptionCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getDeviceServiceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceServiceDescriptionCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getDeviceServiceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceServiceDescriptionCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getDeviceServiceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceServiceDescriptionCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getDeviceServiceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceServiceDescriptionCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getDeviceServiceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceServiceDescriptionCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getDeviceServiceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceServiceDescriptionCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getDeviceServiceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceServiceDescriptionCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
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
    public void testGetDeviceServiceDescriptionCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.getDeviceServiceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetDeviceServiceDescriptionCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.getDeviceServiceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetEncodingMaxLengthFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getEncodingMaxLength();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetEncodingMaxLengthCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getEncodingMaxLength();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetEncodingMaxLengthCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getEncodingMaxLength();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetEncodingMaxLengthCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getEncodingMaxLength();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetEncodingMaxLengthCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getEncodingMaxLength();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetEncodingMaxLengthCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getEncodingMaxLength();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetEncodingMaxLengthCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.getEncodingMaxLength();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetEncodingMaxLengthCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.getEncodingMaxLength();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetErrorReportingTypeCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.getErrorReportingType();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetErrorReportingTypeCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getErrorReportingType();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetErrorReportingTypeCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getErrorReportingType();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetErrorReportingTypeCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getErrorReportingType();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetErrorReportingTypeCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getErrorReportingType();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetErrorReportingTypeCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getErrorReportingType();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetErrorReportingTypeCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getErrorReportingType();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetErrorReportingTypeCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getErrorReportingType();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetErrorReportingTypeCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getErrorReportingType();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetErrorReportingTypeCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getErrorReportingType();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetErrorReportingTypeCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getErrorReportingType();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetErrorReportingTypeCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getErrorReportingType();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetErrorReportingTypeCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getErrorReportingType();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetErrorReportingTypeCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.getErrorReportingType();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetErrorReportingTypeCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.getErrorReportingType();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetErrorReportingTypeCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.setErrorReportingType(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetErrorReportingTypeCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.setErrorReportingType(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetErrorReportingTypeCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.setErrorReportingType(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetErrorReportingTypeCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.setErrorReportingType(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetErrorReportingTypeCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.setErrorReportingType(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetErrorReportingTypeCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.setErrorReportingType(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetErrorReportingTypeCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.setErrorReportingType(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetErrorReportingTypeCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.setErrorReportingType(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetErrorReportingTypeCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.setErrorReportingType(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetErrorReportingTypeCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.setErrorReportingType(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetErrorReportingTypeCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.setErrorReportingType(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetErrorReportingTypeCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.setErrorReportingType(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetErrorReportingTypeCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.setErrorReportingType(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetErrorReportingTypeCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.setErrorReportingType(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetErrorReportingTypeCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.setErrorReportingType(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetExpirationDateCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.getExpirationDate();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetExpirationDateCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getExpirationDate();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetExpirationDateCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getExpirationDate();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetExpirationDateCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getExpirationDate();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetExpirationDateCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getExpirationDate();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetExpirationDateCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getExpirationDate();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetExpirationDateCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getExpirationDate();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetExpirationDateCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getExpirationDate();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetExpirationDateCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getExpirationDate();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetExpirationDateCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getExpirationDate();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetExpirationDateCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getExpirationDate();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetExpirationDateCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getExpirationDate();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetExpirationDateCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getExpirationDate();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetExpirationDateCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.getExpirationDate();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetExpirationDateCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.getExpirationDate();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetFirstNameCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.getFirstName();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetFirstNameCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getFirstName();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetFirstNameCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getFirstName();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetFirstNameCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getFirstName();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetFirstNameCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getFirstName();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetFirstNameCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getFirstName();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetFirstNameCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getFirstName();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetFirstNameCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getFirstName();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetFirstNameCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getFirstName();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetFirstNameCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getFirstName();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetFirstNameCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getFirstName();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetFirstNameCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getFirstName();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetFirstNameCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getFirstName();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetFirstNameCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.getFirstName();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetFirstNameCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.getFirstName();
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
    public void testGetFreezeEventsCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getFreezeEvents();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetFreezeEventsCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getFreezeEvents();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetFreezeEventsCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getFreezeEvents();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetFreezeEventsCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getFreezeEvents();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetFreezeEventsCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getFreezeEvents();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetFreezeEventsCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getFreezeEvents();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetFreezeEventsCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getFreezeEvents();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetFreezeEventsCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
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
    public void testGetFreezeEventsCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.getFreezeEvents();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetFreezeEventsCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
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
    public void testSetFreezeEventsCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.setFreezeEvents(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetFreezeEventsCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.setFreezeEvents(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetFreezeEventsCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.setFreezeEvents(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetFreezeEventsCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.setFreezeEvents(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetFreezeEventsCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.setFreezeEvents(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetFreezeEventsCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.setFreezeEvents(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetFreezeEventsCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.setFreezeEvents(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetFreezeEventsCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
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
    public void testSetFreezeEventsCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.setFreezeEvents(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetFreezeEventsCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.setFreezeEvents(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetMiddleInitialCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.getMiddleInitial();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMiddleInitialCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getMiddleInitial();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMiddleInitialCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getMiddleInitial();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMiddleInitialCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getMiddleInitial();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMiddleInitialCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getMiddleInitial();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMiddleInitialCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getMiddleInitial();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMiddleInitialCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getMiddleInitial();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMiddleInitialCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getMiddleInitial();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMiddleInitialCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getMiddleInitial();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMiddleInitialCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getMiddleInitial();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMiddleInitialCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getMiddleInitial();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMiddleInitialCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getMiddleInitial();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMiddleInitialCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getMiddleInitial();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMiddleInitialCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.getMiddleInitial();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetMiddleInitialCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.getMiddleInitial();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetParseDecodeDataCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.getParseDecodeData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetParseDecodeDataCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getParseDecodeData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetParseDecodeDataCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getParseDecodeData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetParseDecodeDataCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getParseDecodeData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetParseDecodeDataCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getParseDecodeData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetParseDecodeDataCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getParseDecodeData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetParseDecodeDataCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getParseDecodeData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetParseDecodeDataCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getParseDecodeData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetParseDecodeDataCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getParseDecodeData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetParseDecodeDataCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getParseDecodeData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetParseDecodeDataCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getParseDecodeData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetParseDecodeDataCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getParseDecodeData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetParseDecodeDataCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getParseDecodeData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetParseDecodeDataCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.getParseDecodeData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetParseDecodeDataCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.getParseDecodeData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetParseDecodeDataCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.setParseDecodeData(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetParseDecodeDataCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.setParseDecodeData(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetParseDecodeDataCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.setParseDecodeData(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetParseDecodeDataCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.setParseDecodeData(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetParseDecodeDataCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.setParseDecodeData(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetParseDecodeDataCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.setParseDecodeData(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetParseDecodeDataCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.setParseDecodeData(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetParseDecodeDataCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.setParseDecodeData(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetParseDecodeDataCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.setParseDecodeData(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetParseDecodeDataCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.setParseDecodeData(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetParseDecodeDataCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.setParseDecodeData(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetParseDecodeDataCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.setParseDecodeData(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetParseDecodeDataCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.setParseDecodeData(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetParseDecodeDataCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.setParseDecodeData(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetParseDecodeDataCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.setParseDecodeData(true);
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
    public void testGetPhysicalDeviceDescriptionCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getPhysicalDeviceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPhysicalDeviceDescriptionCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getPhysicalDeviceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPhysicalDeviceDescriptionCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getPhysicalDeviceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPhysicalDeviceDescriptionCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getPhysicalDeviceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPhysicalDeviceDescriptionCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getPhysicalDeviceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPhysicalDeviceDescriptionCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getPhysicalDeviceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPhysicalDeviceDescriptionCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getPhysicalDeviceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPhysicalDeviceDescriptionCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
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
    public void testGetPhysicalDeviceDescriptionCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.getPhysicalDeviceDescription();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPhysicalDeviceDescriptionCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
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
    public void testGetPhysicalDeviceNameCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getPhysicalDeviceName();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPhysicalDeviceNameCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getPhysicalDeviceName();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPhysicalDeviceNameCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getPhysicalDeviceName();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPhysicalDeviceNameCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getPhysicalDeviceName();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPhysicalDeviceNameCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getPhysicalDeviceName();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPhysicalDeviceNameCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getPhysicalDeviceName();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPhysicalDeviceNameCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getPhysicalDeviceName();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPhysicalDeviceNameCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
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
    public void testGetPhysicalDeviceNameCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.getPhysicalDeviceName();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPhysicalDeviceNameCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.getPhysicalDeviceName();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetPowerNotifyFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.getPowerNotify();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetPowerNotifyCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getPowerNotify();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerNotifyCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getPowerNotify();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerNotifyCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getPowerNotify();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerNotifyCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getPowerNotify();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerNotifyCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getPowerNotify();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerNotifyCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getPowerNotify();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerNotifyCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getPowerNotify();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerNotifyCalledOnServiceVersion110() {
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
    public void testGetPowerNotifyCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.getPowerNotify();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerNotifyCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.getPowerNotify();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetPowerNotifyFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.setPowerNotify(0);
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    @Test
    public void testSetPowerNotifyCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.setPowerNotify(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetPowerNotifyCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.setPowerNotify(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetPowerNotifyCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.setPowerNotify(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetPowerNotifyCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.setPowerNotify(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetPowerNotifyCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.setPowerNotify(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetPowerNotifyCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.setPowerNotify(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetPowerNotifyCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.setPowerNotify(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetPowerNotifyCalledOnServiceVersion110() {
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
    public void testSetPowerNotifyCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.setPowerNotify(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetPowerNotifyCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.setPowerNotify(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerStateFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.getPowerState();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetPowerStateCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getPowerState();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerStateCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getPowerState();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerStateCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getPowerState();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerStateCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getPowerState();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerStateCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getPowerState();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerStateCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getPowerState();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerStateCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getPowerState();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerStateCalledOnServiceVersion110() {
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
    public void testGetPowerStateCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.getPowerState();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetPowerStateCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.getPowerState();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetServiceCodeCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.getServiceCode();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetServiceCodeCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getServiceCode();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetServiceCodeCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getServiceCode();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetServiceCodeCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getServiceCode();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetServiceCodeCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getServiceCode();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetServiceCodeCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getServiceCode();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetServiceCodeCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getServiceCode();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetServiceCodeCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getServiceCode();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetServiceCodeCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getServiceCode();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetServiceCodeCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getServiceCode();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetServiceCodeCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getServiceCode();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetServiceCodeCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getServiceCode();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetServiceCodeCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getServiceCode();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetServiceCodeCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.getServiceCode();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetServiceCodeCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.getServiceCode();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetSuffixCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.getSuffix();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetSuffixCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getSuffix();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetSuffixCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getSuffix();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetSuffixCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getSuffix();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetSuffixCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getSuffix();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetSuffixCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getSuffix();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetSuffixCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getSuffix();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetSuffixCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getSuffix();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetSuffixCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getSuffix();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetSuffixCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getSuffix();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetSuffixCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getSuffix();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetSuffixCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getSuffix();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetSuffixCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getSuffix();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetSuffixCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.getSuffix();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetSuffixCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.getSuffix();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetSurnameCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.getSurname();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetSurnameCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getSurname();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetSurnameCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getSurname();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetSurnameCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getSurname();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetSurnameCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getSurname();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetSurnameCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getSurname();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetSurnameCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getSurname();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetSurnameCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getSurname();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetSurnameCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getSurname();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetSurnameCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getSurname();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetSurnameCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getSurname();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetSurnameCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getSurname();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetSurnameCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getSurname();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetSurnameCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.getSurname();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetSurnameCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.getSurname();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetTitleCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.getTitle();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTitleCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getTitle();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTitleCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getTitle();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTitleCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getTitle();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTitleCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getTitle();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTitleCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getTitle();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTitleCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getTitle();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTitleCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getTitle();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTitleCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getTitle();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTitleCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getTitle();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTitleCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getTitle();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTitleCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getTitle();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTitleCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getTitle();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTitleCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.getTitle();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTitleCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.getTitle();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetTrack1DataCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.getTrack1Data();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack1DataCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getTrack1Data();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack1DataCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getTrack1Data();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack1DataCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getTrack1Data();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack1DataCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getTrack1Data();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack1DataCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getTrack1Data();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack1DataCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getTrack1Data();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack1DataCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getTrack1Data();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack1DataCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getTrack1Data();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack1DataCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getTrack1Data();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack1DataCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getTrack1Data();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack1DataCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getTrack1Data();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack1DataCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getTrack1Data();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack1DataCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.getTrack1Data();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack1DataCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.getTrack1Data();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetTrack1DiscretionaryDataCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.getTrack1DiscretionaryData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack1DiscretionaryDataCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getTrack1DiscretionaryData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack1DiscretionaryDataCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getTrack1DiscretionaryData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack1DiscretionaryDataCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getTrack1DiscretionaryData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack1DiscretionaryDataCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getTrack1DiscretionaryData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack1DiscretionaryDataCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getTrack1DiscretionaryData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack1DiscretionaryDataCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getTrack1DiscretionaryData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack1DiscretionaryDataCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getTrack1DiscretionaryData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack1DiscretionaryDataCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getTrack1DiscretionaryData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack1DiscretionaryDataCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getTrack1DiscretionaryData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack1DiscretionaryDataCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getTrack1DiscretionaryData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack1DiscretionaryDataCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getTrack1DiscretionaryData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack1DiscretionaryDataCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getTrack1DiscretionaryData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack1DiscretionaryDataCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.getTrack1DiscretionaryData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack1DiscretionaryDataCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.getTrack1DiscretionaryData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetTrack1EncryptedDataFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getTrack1EncryptedData();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetTrack1EncryptedDataCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getTrack1EncryptedData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack1EncryptedDataCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getTrack1EncryptedData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack1EncryptedDataCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getTrack1EncryptedData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack1EncryptedDataCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.getTrack1EncryptedData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack1EncryptedDataCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.getTrack1EncryptedData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetTrack1EncryptedDataLengthFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getTrack1EncryptedDataLength();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetTrack1EncryptedDataLengthCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getTrack1EncryptedDataLength();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack1EncryptedDataLengthCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getTrack1EncryptedDataLength();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack1EncryptedDataLengthCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getTrack1EncryptedDataLength();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack1EncryptedDataLengthCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.getTrack1EncryptedDataLength();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack1EncryptedDataLengthCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.getTrack1EncryptedDataLength();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetTrack2DataCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.getTrack2Data();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack2DataCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getTrack2Data();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack2DataCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getTrack2Data();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack2DataCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getTrack2Data();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack2DataCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getTrack2Data();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack2DataCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getTrack2Data();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack2DataCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getTrack2Data();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack2DataCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getTrack2Data();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack2DataCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getTrack2Data();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack2DataCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getTrack2Data();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack2DataCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getTrack2Data();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack2DataCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getTrack2Data();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack2DataCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getTrack2Data();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack2DataCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.getTrack2Data();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack2DataCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.getTrack2Data();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetTrack2DiscretionaryDataCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.getTrack2DiscretionaryData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack2DiscretionaryDataCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getTrack2DiscretionaryData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack2DiscretionaryDataCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getTrack2DiscretionaryData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack2DiscretionaryDataCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getTrack2DiscretionaryData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack2DiscretionaryDataCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getTrack2DiscretionaryData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack2DiscretionaryDataCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getTrack2DiscretionaryData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack2DiscretionaryDataCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getTrack2DiscretionaryData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack2DiscretionaryDataCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getTrack2DiscretionaryData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack2DiscretionaryDataCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getTrack2DiscretionaryData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack2DiscretionaryDataCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getTrack2DiscretionaryData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack2DiscretionaryDataCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getTrack2DiscretionaryData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack2DiscretionaryDataCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getTrack2DiscretionaryData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack2DiscretionaryDataCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getTrack2DiscretionaryData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack2DiscretionaryDataCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.getTrack2DiscretionaryData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack2DiscretionaryDataCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.getTrack2DiscretionaryData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetTrack2EncryptedDataFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getTrack2EncryptedData();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetTrack2EncryptedDataCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getTrack2EncryptedData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack2EncryptedDataCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getTrack2EncryptedData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack2EncryptedDataCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getTrack2EncryptedData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack2EncryptedDataCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.getTrack2EncryptedData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack2EncryptedDataCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.getTrack2EncryptedData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetTrack2EncryptedDataLengthFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getTrack2EncryptedDataLength();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetTrack2EncryptedDataLengthCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getTrack2EncryptedDataLength();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack2EncryptedDataLengthCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getTrack2EncryptedDataLength();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack2EncryptedDataLengthCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getTrack2EncryptedDataLength();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack2EncryptedDataLengthCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.getTrack2EncryptedDataLength();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack2EncryptedDataLengthCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.getTrack2EncryptedDataLength();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetTrack3DataCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.getTrack3Data();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack3DataCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getTrack3Data();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack3DataCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getTrack3Data();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack3DataCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getTrack3Data();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack3DataCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getTrack3Data();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack3DataCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getTrack3Data();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack3DataCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getTrack3Data();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack3DataCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getTrack3Data();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack3DataCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getTrack3Data();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack3DataCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getTrack3Data();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack3DataCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getTrack3Data();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack3DataCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getTrack3Data();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack3DataCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getTrack3Data();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack3DataCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.getTrack3Data();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack3DataCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.getTrack3Data();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetTrack3EncryptedDataFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getTrack3EncryptedData();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetTrack3EncryptedDataCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getTrack3EncryptedData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack3EncryptedDataCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getTrack3EncryptedData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack3EncryptedDataCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getTrack3EncryptedData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack3EncryptedDataCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.getTrack3EncryptedData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack3EncryptedDataCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.getTrack3EncryptedData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetTrack3EncryptedDataLengthFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getTrack3EncryptedDataLength();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetTrack3EncryptedDataLengthCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getTrack3EncryptedDataLength();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack3EncryptedDataLengthCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getTrack3EncryptedDataLength();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack3EncryptedDataLengthCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getTrack3EncryptedDataLength();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack3EncryptedDataLengthCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.getTrack3EncryptedDataLength();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack3EncryptedDataLengthCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.getTrack3EncryptedDataLength();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetTrack4DataFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getTrack4Data();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetTrack4DataCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getTrack4Data();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack4DataCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getTrack4Data();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack4DataCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getTrack4Data();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack4DataCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getTrack4Data();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack4DataCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getTrack4Data();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack4DataCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getTrack4Data();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack4DataCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getTrack4Data();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack4DataCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getTrack4Data();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack4DataCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getTrack4Data();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack4DataCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getTrack4Data();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack4DataCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.getTrack4Data();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack4DataCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.getTrack4Data();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetTrack4EncryptedDataFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getTrack4EncryptedData();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetTrack4EncryptedDataCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getTrack4EncryptedData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack4EncryptedDataCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getTrack4EncryptedData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack4EncryptedDataCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getTrack4EncryptedData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack4EncryptedDataCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.getTrack4EncryptedData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack4EncryptedDataCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.getTrack4EncryptedData();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testGetTrack4EncryptedDataLengthFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getTrack4EncryptedDataLength();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetTrack4EncryptedDataLengthCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getTrack4EncryptedDataLength();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack4EncryptedDataLengthCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getTrack4EncryptedDataLength();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack4EncryptedDataLengthCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getTrack4EncryptedDataLength();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack4EncryptedDataLengthCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.getTrack4EncryptedDataLength();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTrack4EncryptedDataLengthCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.getTrack4EncryptedDataLength();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    
    @Test
    public void testGetTracksToReadCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.getTracksToRead();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTracksToReadCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.getTracksToRead();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTracksToReadCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getTracksToRead();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTracksToReadCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getTracksToRead();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTracksToReadCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getTracksToRead();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTracksToReadCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getTracksToRead();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTracksToReadCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getTracksToRead();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTracksToReadCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getTracksToRead();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTracksToReadCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getTracksToRead();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTracksToReadCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getTracksToRead();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTracksToReadCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getTracksToRead();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTracksToReadCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getTracksToRead();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTracksToReadCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getTracksToRead();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTracksToReadCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.getTracksToRead();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTracksToReadCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.getTracksToRead();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetTracksToReadCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.setTracksToRead(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetTracksToReadCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.setTracksToRead(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetTracksToReadCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.setTracksToRead(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetTracksToReadCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.setTracksToRead(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetTracksToReadCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.setTracksToRead(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetTracksToReadCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.setTracksToRead(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetTracksToReadCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.setTracksToRead(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetTracksToReadCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.setTracksToRead(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetTracksToReadCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.setTracksToRead(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetTracksToReadCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.setTracksToRead(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetTracksToReadCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.setTracksToRead(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetTracksToReadCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.setTracksToRead(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetTracksToReadCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.setTracksToRead(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetTracksToReadCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.setTracksToRead(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetTracksToReadCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.setTracksToRead(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTracksToWriteFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getTracksToWrite();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetTracksToWriteCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getTracksToWrite();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTracksToWriteCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getTracksToWrite();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTracksToWriteCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getTracksToWrite();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTracksToWriteCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getTracksToWrite();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTracksToWriteCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getTracksToWrite();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTracksToWriteCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.getTracksToWrite();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTracksToWriteCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.getTracksToWrite();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetTracksToWriteFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.setTracksToWrite(0);
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    @Test
    public void testSetTracksToWriteCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.setTracksToWrite(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetTracksToWriteCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.setTracksToWrite(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetTracksToWriteCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.setTracksToWrite(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetTracksToWriteCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.setTracksToWrite(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetTracksToWriteCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.setTracksToWrite(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetTracksToWriteCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.setTracksToWrite(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetTracksToWriteCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.setTracksToWrite(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTransmitSentinelsFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.getTransmitSentinels();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetTransmitSentinelsCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.getTransmitSentinels();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTransmitSentinelsCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.getTransmitSentinels();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTransmitSentinelsCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.getTransmitSentinels();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTransmitSentinelsCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.getTransmitSentinels();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTransmitSentinelsCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.getTransmitSentinels();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTransmitSentinelsCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.getTransmitSentinels();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTransmitSentinelsCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getTransmitSentinels();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTransmitSentinelsCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getTransmitSentinels();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTransmitSentinelsCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getTransmitSentinels();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTransmitSentinelsCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getTransmitSentinels();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTransmitSentinelsCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.getTransmitSentinels();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetTransmitSentinelsCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.getTransmitSentinels();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetTransmitSentinelsFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.setTransmitSentinels(true);
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    @Test
    public void testSetTransmitSentinelsCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.setTransmitSentinels(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetTransmitSentinelsCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.setTransmitSentinels(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetTransmitSentinelsCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.setTransmitSentinels(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetTransmitSentinelsCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.setTransmitSentinels(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetTransmitSentinelsCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.setTransmitSentinels(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetTransmitSentinelsCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.setTransmitSentinels(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetTransmitSentinelsCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.setTransmitSentinels(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetTransmitSentinelsCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.setTransmitSentinels(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetTransmitSentinelsCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.setTransmitSentinels(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetTransmitSentinelsCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.setTransmitSentinels(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetTransmitSentinelsCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.setTransmitSentinels(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetTransmitSentinelsCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.setTransmitSentinels(true);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetWriteCardTypeFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.getWriteCardType();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testGetWriteCardTypeCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.getWriteCardType();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetWriteCardTypeCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.getWriteCardType();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetWriteCardTypeCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.getWriteCardType();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetWriteCardTypeCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.getWriteCardType();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testGetWriteCardTypeCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.getWriteCardType();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetWriteCardTypeFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.setWriteCardType("");
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    @Test
    public void testSetWriteCardTypeCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.setWriteCardType("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetWriteCardTypeCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.setWriteCardType("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetWriteCardTypeCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.setWriteCardType("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetWriteCardTypeCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.setWriteCardType("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testSetWriteCardTypeCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.setWriteCardType("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testAuthenticateDeviceFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.authenticateDevice(new byte[0]);
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testAuthenticateDeviceCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.authenticateDevice(new byte[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testAuthenticateDeviceCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.authenticateDevice(new byte[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testAuthenticateDeviceCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.authenticateDevice(new byte[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testAuthenticateDeviceCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.authenticateDevice(new byte[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testAuthenticateDeviceCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.authenticateDevice(new byte[0]);
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
    public void testCheckHealthCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.checkHealth(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCheckHealthCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.checkHealth(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCheckHealthCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.checkHealth(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCheckHealthCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.checkHealth(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCheckHealthCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.checkHealth(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCheckHealthCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.checkHealth(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCheckHealthCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.checkHealth(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCheckHealthCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
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
    public void testCheckHealthCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.checkHealth(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCheckHealthCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
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
    public void testClaimCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.claim(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClaimCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.claim(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClaimCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.claim(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClaimCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.claim(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClaimCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.claim(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClaimCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.claim(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClaimCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.claim(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClaimCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
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
    public void testClaimCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.claim(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClaimCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.claim(0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    
    @Test
    public void testClearInputCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_12);
            this.control.clearInput();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClearInputCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.clearInput();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClearInputCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.clearInput();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClearInputCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.clearInput();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClearInputCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.clearInput();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClearInputCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.clearInput();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClearInputCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.clearInput();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClearInputCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.clearInput();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClearInputCalledOnServiceVersion110() {
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
    public void testClearInputCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.clearInput();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClearInputCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.clearInput();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClearInputPropertiesFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.clearInputProperties();
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testClearInputPropertiesCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.clearInputProperties();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClearInputPropertiesCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.clearInputProperties();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClearInputPropertiesCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.clearInputProperties();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClearInputPropertiesCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.clearInputProperties();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClearInputPropertiesCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.clearInputProperties();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClearInputPropertiesCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.clearInputProperties();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testClearInputPropertiesCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.clearInputProperties();
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
    public void testCloseCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.close();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCloseCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.close();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCloseCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.close();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCloseCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.close();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCloseCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.close();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCloseCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.close();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCloseCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.close();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCloseCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
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
    public void testCloseCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.close();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCloseCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.close();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCompareFirmwareVersionFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.compareFirmwareVersion("",new int[0]);
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testCompareFirmwareVersionCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.compareFirmwareVersion("",new int[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCompareFirmwareVersionCalledOnServiceVersion110() {
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
    public void testCompareFirmwareVersionCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.compareFirmwareVersion("",new int[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testCompareFirmwareVersionCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.compareFirmwareVersion("",new int[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testDeauthenticateDeviceFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.deauthenticateDevice(new byte[0]);
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testDeauthenticateDeviceCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.deauthenticateDevice(new byte[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testDeauthenticateDeviceCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.deauthenticateDevice(new byte[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testDeauthenticateDeviceCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.deauthenticateDevice(new byte[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testDeauthenticateDeviceCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.deauthenticateDevice(new byte[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testDeauthenticateDeviceCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.deauthenticateDevice(new byte[0]);
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
    public void testDirectIOCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.directIO(0,new int[0],new Object());
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testDirectIOCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.directIO(0,new int[0],new Object());
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testDirectIOCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.directIO(0,new int[0],new Object());
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testDirectIOCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.directIO(0,new int[0],new Object());
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testDirectIOCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.directIO(0,new int[0],new Object());
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testDirectIOCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.directIO(0,new int[0],new Object());
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testDirectIOCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.directIO(0,new int[0],new Object());
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testDirectIOCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
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
    public void testDirectIOCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.directIO(0,new int[0],new Object());
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testDirectIOCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.directIO(0,new int[0],new Object());
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
    public void testReleaseCalledOnServiceVersion13() {
        try {
            this.control.open(OPENNAME_SERVICE_13);
            this.control.release();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testReleaseCalledOnServiceVersion14() {
        try {
            this.control.open(OPENNAME_SERVICE_14);
            this.control.release();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testReleaseCalledOnServiceVersion15() {
        try {
            this.control.open(OPENNAME_SERVICE_15);
            this.control.release();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testReleaseCalledOnServiceVersion16() {
        try {
            this.control.open(OPENNAME_SERVICE_16);
            this.control.release();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testReleaseCalledOnServiceVersion17() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.release();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testReleaseCalledOnServiceVersion18() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.release();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testReleaseCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.release();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testReleaseCalledOnServiceVersion110() {
        try {
            this.control.open(OPENNAME_SERVICE_110);
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
    public void testReleaseCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.release();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testReleaseCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.release();
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testResetStatisticsFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.resetStatistics("");
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testResetStatisticsCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.resetStatistics("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testResetStatisticsCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.resetStatistics("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testResetStatisticsCalledOnServiceVersion110() {
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
    public void testResetStatisticsCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.resetStatistics("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testResetStatisticsCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.resetStatistics("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testRetrieveCardPropertyFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.retrieveCardProperty("",new String[0]);
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testRetrieveCardPropertyCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.retrieveCardProperty("",new String[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testRetrieveCardPropertyCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.retrieveCardProperty("",new String[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testRetrieveCardPropertyCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.retrieveCardProperty("",new String[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testRetrieveCardPropertyCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.retrieveCardProperty("",new String[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testRetrieveCardPropertyCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.retrieveCardProperty("",new String[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testRetrieveDeviceAuthenticationDataByteArrayArrayFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.retrieveDeviceAuthenticationData(new byte[0][0]);
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testRetrieveDeviceAuthenticationDataByteArrayArrayCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.retrieveDeviceAuthenticationData(new byte[0][0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testRetrieveDeviceAuthenticationDataByteArrayArrayCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.retrieveDeviceAuthenticationData(new byte[0][0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testRetrieveDeviceAuthenticationDataByteArrayArrayCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.retrieveDeviceAuthenticationData(new byte[0][0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testRetrieveDeviceAuthenticationDataByteArrayArrayCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.retrieveDeviceAuthenticationData(new byte[0][0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testRetrieveDeviceAuthenticationDataByteArrayFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.retrieveDeviceAuthenticationData(new byte[0]);
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testRetrieveDeviceAuthenticationDataByteArrayCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.retrieveDeviceAuthenticationData(new byte[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testRetrieveDeviceAuthenticationDataByteArrayCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.retrieveDeviceAuthenticationData(new byte[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testRetrieveDeviceAuthenticationDataByteArrayCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.retrieveDeviceAuthenticationData(new byte[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testRetrieveDeviceAuthenticationDataByteArrayCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.retrieveDeviceAuthenticationData(new byte[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testRetrieveDeviceAuthenticationDataByteArrayCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.retrieveDeviceAuthenticationData(new byte[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testRetrieveStatisticsFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.retrieveStatistics(new String[0]);
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testRetrieveStatisticsCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.retrieveStatistics(new String[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testRetrieveStatisticsCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.retrieveStatistics(new String[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testRetrieveStatisticsCalledOnServiceVersion110() {
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
    public void testRetrieveStatisticsCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.retrieveStatistics(new String[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testRetrieveStatisticsCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.retrieveStatistics(new String[0]);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testUpdateFirmwareFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.updateFirmware("");
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testUpdateFirmwareCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.updateFirmware("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testUpdateFirmwareCalledOnServiceVersion110() {
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
    public void testUpdateFirmwareCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.updateFirmware("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testUpdateFirmwareCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.updateFirmware("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testUpdateKeyFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.updateKey("","");
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testUpdateKeyCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.updateKey("","");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testUpdateKeyCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.updateKey("","");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testUpdateKeyCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.updateKey("","");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testUpdateKeyCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.updateKey("","");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testUpdateKeyCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.updateKey("","");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testUpdateStatisticsFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_17);
            this.control.updateStatistics("");
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testUpdateStatisticsCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_18);
            this.control.updateStatistics("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testUpdateStatisticsCalledOnServiceVersion19() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.updateStatistics("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testUpdateStatisticsCalledOnServiceVersion110() {
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
    
    @Test
    public void testUpdateStatisticsCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.updateStatistics("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testUpdateStatisticsCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.updateStatistics("");
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testWriteTracksFailsOnServiceVersionBeforeAdded() {
        try {
            this.control.open(OPENNAME_SERVICE_19);
            this.control.writeTracks(new byte[0][0],0);
            fail("NOSERVICE JposException expected but not thrown");
        }
        catch (JposException e) {
            assertThat("NOSERVICE JposException expected but a different was thrown: " + e.getErrorCode(), 
                    e.getErrorCode(), is(JposConst.JPOS_E_NOSERVICE));
        }
    }
    
    
    @Test
    public void testWriteTracksCalledOnServiceVersionWhenAdded() throws Exception {
        try {
            this.control.open(OPENNAME_SERVICE_110);
            this.control.writeTracks(new byte[0][0],0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testWriteTracksCalledOnServiceVersion111() {
        try {
            this.control.open(OPENNAME_SERVICE_111);
            this.control.writeTracks(new byte[0][0],0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testWriteTracksCalledOnServiceVersion112() {
        try {
            this.control.open(OPENNAME_SERVICE_112);
            this.control.writeTracks(new byte[0][0],0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testWriteTracksCalledOnServiceVersion113() {
        try {
            this.control.open(OPENNAME_SERVICE_113);
            this.control.writeTracks(new byte[0][0],0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testWriteTracksCalledOnServiceVersion114() {
        try {
            this.control.open(OPENNAME_SERVICE_114);
            this.control.writeTracks(new byte[0][0],0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testWriteTracksCalledOnServiceVersion115() {
        try {
            this.control.open(OPENNAME_SERVICE_115);
            this.control.writeTracks(new byte[0][0],0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testWriteTracksCalledOnServiceVersion116() {
        try {
            this.control.open(OPENNAME_SERVICE_116);
            this.control.writeTracks(new byte[0][0],0);
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testDataEventDelivery() {
        final int numberOfListeners = 5;
        final AtomicInteger remainingEventsToReceive = new AtomicInteger(numberOfListeners); // no concurrency, just boxed decrement is used 
        List<DataListener> listeners = new ArrayList<DataListener>();
        
        try {
            this.control.open(OPENNAME_SERVICE_116);
            
            for (int i = 0; i < numberOfListeners; i++) {
                DataListener listener = new DataListener() {
                    @Override
                    public void dataOccurred(DataEvent e) {
                        remainingEventsToReceive.decrementAndGet();
                    }
                };
                this.control.addDataListener(listener);
                listeners.add(listener);
            }
            
            this.control.directIO(ControlsTestHelper.SEND_DATA_EVENT, null, null);
            assertThat("not all listener received DataEvents", 
                    remainingEventsToReceive.get(), is(0));
            
            for (DataListener listener : listeners) {
                this.control.removeDataListener(listener);
            }
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testDirectIOEventDelivery() {
        final int numberOfListeners = 5;
        final AtomicInteger remainingEventsToReceive = new AtomicInteger(numberOfListeners); // no concurrency, just boxed decrement is used 
        List<DirectIOListener> listeners = new ArrayList<DirectIOListener>();
        
        try {
            this.control.open(OPENNAME_SERVICE_116);
            
            for (int i = 0; i < numberOfListeners; i++) {
                DirectIOListener listener = new DirectIOListener() {
                    @Override
                    public void directIOOccurred(DirectIOEvent e) {
                        remainingEventsToReceive.decrementAndGet();
                    }
                };
                this.control.addDirectIOListener(listener);
                listeners.add(listener);
            }
            
            this.control.directIO(ControlsTestHelper.SEND_DIRECTIO_EVENT, null, null);
            assertThat("not all listener received DirectIOEvents", 
                    remainingEventsToReceive.get(), is(0));
            
            for (DirectIOListener listener : listeners) {
                this.control.removeDirectIOListener(listener);
            }
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testErrorEventDelivery() {
        final int numberOfListeners = 5;
        final AtomicInteger remainingEventsToReceive = new AtomicInteger(numberOfListeners); // no concurrency, just boxed decrement is used 
        List<ErrorListener> listeners = new ArrayList<ErrorListener>();
        
        try {
            this.control.open(OPENNAME_SERVICE_116);
            
            for (int i = 0; i < numberOfListeners; i++) {
                ErrorListener listener = new ErrorListener() {
                    @Override
                    public void errorOccurred(ErrorEvent e) {
                        remainingEventsToReceive.decrementAndGet();
                    }
                };
                this.control.addErrorListener(listener);
                listeners.add(listener);
            }
            
            this.control.directIO(ControlsTestHelper.SEND_ERROR_EVENT, null, null);
            assertThat("not all listener received ErrorEvents", 
                    remainingEventsToReceive.get(), is(0));
            
            for (ErrorListener listener : listeners) {
                this.control.removeErrorListener(listener);
            }
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
    
    @Test
    public void testStatusUpdateEventDelivery() {
        final int numberOfListeners = 5;
        final AtomicInteger remainingEventsToReceive = new AtomicInteger(numberOfListeners); // no concurrency, just boxed decrement is used 
        List<StatusUpdateListener> listeners = new ArrayList<StatusUpdateListener>();
        
        try {
            this.control.open(OPENNAME_SERVICE_116);
            
            for (int i = 0; i < numberOfListeners; i++) {
                StatusUpdateListener listener = new StatusUpdateListener() {
                    @Override
                    public void statusUpdateOccurred(StatusUpdateEvent e) {
                        remainingEventsToReceive.decrementAndGet();
                    }
                };
                this.control.addStatusUpdateListener(listener);
                listeners.add(listener);
            }
            
            this.control.directIO(ControlsTestHelper.SEND_STATUSUPDATE_EVENT, null, null);
            assertThat("not all listener received StatusUpdateEvents", 
                    remainingEventsToReceive.get(), is(0));
            
            for (StatusUpdateListener listener : listeners) {
                this.control.removeStatusUpdateListener(listener);
            }
        }
        catch (JposException e) {
            fail(e.getMessage());
        }
    }
}
