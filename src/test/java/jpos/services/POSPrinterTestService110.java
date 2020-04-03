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

package jpos.services;

import jpos.JposConst;
import jpos.JposException;
import jpos.config.JposEntry;
import jpos.loader.JposServiceInstance;
import jpos.loader.JposServiceLoader;
import jpos.events.*;

/**
 * JavaPOS Device Service class, intended to be used for testing purposes in POSPrinterTest.
 *
 */
public final class POSPrinterTestService110 implements jpos.services.POSPrinterService110, JposServiceInstance {
    
    private JposEntry configuration;
    private EventCallbacks callbacks;
    
    @Override
    public int getDeviceServiceVersion() throws JposException {
        if (configuration.hasPropertyWithName("returnVersionTooLarge"))
            return 1011000;
        else if (configuration.hasPropertyWithName("throwingNPEOnGetDSVersion"))
            throw new NullPointerException();
        else
            return 1010000;
    }
    
    @Override
    public int getState() throws JposException {
        return JposConst.JPOS_S_IDLE;
    }

    @Override
    public void open(String logicalName, EventCallbacks cb) throws JposException {
        configuration = JposServiceLoader.getManager().getEntryRegistry().getJposEntry(logicalName);
        callbacks = cb;
    }

    @Override
    public void deleteInstance() throws JposException {
        // intentionally left empty
    }
    
    @Override
    public void directIO(int command, int[] data, Object object) throws JposException 
    {
        switch (command) {
        case jpos.ControlsTestHelper.SEND_DATA_EVENT:
            this.callbacks.fireDataEvent(new DataEvent(this.callbacks.getEventSource(), 0));
        case jpos.ControlsTestHelper.SEND_DIRECTIO_EVENT:
            this.callbacks.fireDirectIOEvent(new DirectIOEvent(this.callbacks.getEventSource(), 1, 2, null));
        case jpos.ControlsTestHelper.SEND_ERROR_EVENT:
            this.callbacks.fireErrorEvent(new ErrorEvent(this.callbacks.getEventSource(), 1, 2, 3, 4));
            break;
        case jpos.ControlsTestHelper.SEND_OUTPUTCOMPLETE_EVENT: 
            this.callbacks.fireOutputCompleteEvent(new OutputCompleteEvent(this.callbacks.getEventSource(), 1));
            break;
        case jpos.ControlsTestHelper.SEND_STATUSUPDATE_EVENT:
            this.callbacks.fireStatusUpdateEvent(new StatusUpdateEvent(this.callbacks.getEventSource(), 1));
            break;
        default:
            break;
        }
    }
    
    
    @Override
    public boolean getAsyncMode() throws JposException {
        return true;
    }
    
    @Override
    public void setAsyncMode(boolean asyncMode) throws JposException {
    }
    
    @Override
    public int getCapCharacterSet() throws JposException {
        return 0;
    }
    
    @Override
    public boolean getCapCompareFirmwareVersion() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapConcurrentJrnRec() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapConcurrentJrnSlp() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapConcurrentPageMode() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapConcurrentRecSlp() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapCoverSensor() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapJrn2Color() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapJrnBold() throws JposException {
        return true;
    }
    
    @Override
    public int getCapJrnCartridgeSensor() throws JposException {
        return 0;
    }
    
    @Override
    public int getCapJrnColor() throws JposException {
        return 0;
    }
    
    @Override
    public boolean getCapJrnDhigh() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapJrnDwide() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapJrnDwideDhigh() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapJrnEmptySensor() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapJrnItalic() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapJrnNearEndSensor() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapJrnPresent() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapJrnUnderline() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapMapCharacterSet() throws JposException {
        return true;
    }
    
    @Override
    public int getCapPowerReporting() throws JposException {
        return 0;
    }
    
    @Override
    public boolean getCapRec2Color() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapRecBarCode() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapRecBitmap() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapRecBold() throws JposException {
        return true;
    }
    
    @Override
    public int getCapRecCartridgeSensor() throws JposException {
        return 0;
    }
    
    @Override
    public int getCapRecColor() throws JposException {
        return 0;
    }
    
    @Override
    public boolean getCapRecDhigh() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapRecDwide() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapRecDwideDhigh() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapRecEmptySensor() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapRecItalic() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapRecLeft90() throws JposException {
        return true;
    }
    
    @Override
    public int getCapRecMarkFeed() throws JposException {
        return 0;
    }
    
    @Override
    public boolean getCapRecNearEndSensor() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapRecPageMode() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapRecPapercut() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapRecPresent() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapRecRight90() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapRecRotate180() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapRecStamp() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapRecUnderline() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapSlp2Color() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapSlpBarCode() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapSlpBitmap() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapSlpBold() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapSlpBothSidesPrint() throws JposException {
        return true;
    }
    
    @Override
    public int getCapSlpCartridgeSensor() throws JposException {
        return 0;
    }
    
    @Override
    public int getCapSlpColor() throws JposException {
        return 0;
    }
    
    @Override
    public boolean getCapSlpDhigh() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapSlpDwide() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapSlpDwideDhigh() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapSlpEmptySensor() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapSlpFullslip() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapSlpItalic() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapSlpLeft90() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapSlpNearEndSensor() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapSlpPageMode() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapSlpPresent() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapSlpRight90() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapSlpRotate180() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapSlpUnderline() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapStatisticsReporting() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapTransaction() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapUpdateFirmware() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapUpdateStatistics() throws JposException {
        return true;
    }
    
    @Override
    public int getCartridgeNotify() throws JposException {
        return 0;
    }
    
    @Override
    public void setCartridgeNotify(int notify) throws JposException {
    }
    
    @Override
    public int getCharacterSet() throws JposException {
        return 0;
    }
    
    @Override
    public void setCharacterSet(int characterSet) throws JposException {
    }
    
    @Override
    public String getCharacterSetList() throws JposException {
        return "";
    }
    
    @Override
    public String getCheckHealthText() throws JposException {
        return "";
    }
    
    @Override
    public boolean getClaimed() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCoverOpen() throws JposException {
        return true;
    }
    
    @Override
    public boolean getDeviceEnabled() throws JposException {
        return true;
    }
    
    @Override
    public void setDeviceEnabled(boolean deviceEnabled) throws JposException {
    }
    
    @Override
    public String getDeviceServiceDescription() throws JposException {
        return "";
    }
    
    @Override
    public int getErrorLevel() throws JposException {
        return 0;
    }
    
    @Override
    public int getErrorStation() throws JposException {
        return 0;
    }
    
    @Override
    public String getErrorString() throws JposException {
        return "";
    }
    
    @Override
    public boolean getFlagWhenIdle() throws JposException {
        return true;
    }
    
    @Override
    public void setFlagWhenIdle(boolean flagWhenIdle) throws JposException {
    }
    
    @Override
    public String getFontTypefaceList() throws JposException {
        return "";
    }
    
    @Override
    public boolean getFreezeEvents() throws JposException {
        return true;
    }
    
    @Override
    public void setFreezeEvents(boolean freezeEvents) throws JposException {
    }
    
    @Override
    public int getJrnCartridgeState() throws JposException {
        return 0;
    }
    
    @Override
    public int getJrnCurrentCartridge() throws JposException {
        return 0;
    }
    
    @Override
    public void setJrnCurrentCartridge(int cartridge) throws JposException {
    }
    
    @Override
    public boolean getJrnEmpty() throws JposException {
        return true;
    }
    
    @Override
    public boolean getJrnLetterQuality() throws JposException {
        return true;
    }
    
    @Override
    public void setJrnLetterQuality(boolean jrnLetterQuality) throws JposException {
    }
    
    @Override
    public int getJrnLineChars() throws JposException {
        return 0;
    }
    
    @Override
    public void setJrnLineChars(int jrnLineChars) throws JposException {
    }
    
    @Override
    public String getJrnLineCharsList() throws JposException {
        return "";
    }
    
    @Override
    public int getJrnLineHeight() throws JposException {
        return 0;
    }
    
    @Override
    public void setJrnLineHeight(int jrnLineHeight) throws JposException {
    }
    
    @Override
    public int getJrnLineSpacing() throws JposException {
        return 0;
    }
    
    @Override
    public void setJrnLineSpacing(int jrnLineSpacing) throws JposException {
    }
    
    @Override
    public int getJrnLineWidth() throws JposException {
        return 0;
    }
    
    @Override
    public boolean getJrnNearEnd() throws JposException {
        return true;
    }
    
    @Override
    public boolean getMapCharacterSet() throws JposException {
        return true;
    }
    
    @Override
    public void setMapCharacterSet(boolean mapCharacterSet) throws JposException {
    }
    
    @Override
    public int getMapMode() throws JposException {
        return 0;
    }
    
    @Override
    public void setMapMode(int mapMode) throws JposException {
    }
    
    @Override
    public int getOutputID() throws JposException {
        return 0;
    }
    
    @Override
    public String getPageModeArea() throws JposException {
        return "";
    }
    
    @Override
    public int getPageModeDescriptor() throws JposException {
        return 0;
    }
    
    @Override
    public int getPageModeHorizontalPosition() throws JposException {
        return 0;
    }
    
    @Override
    public void setPageModeHorizontalPosition(int position) throws JposException {
    }
    
    @Override
    public String getPageModePrintArea() throws JposException {
        return "";
    }
    
    @Override
    public void setPageModePrintArea(String area) throws JposException {
    }
    
    @Override
    public int getPageModePrintDirection() throws JposException {
        return 0;
    }
    
    @Override
    public void setPageModePrintDirection(int direction) throws JposException {
    }
    
    @Override
    public int getPageModeStation() throws JposException {
        return 0;
    }
    
    @Override
    public void setPageModeStation(int station) throws JposException {
    }
    
    @Override
    public int getPageModeVerticalPosition() throws JposException {
        return 0;
    }
    
    @Override
    public void setPageModeVerticalPosition(int position) throws JposException {
    }
    
    @Override
    public String getPhysicalDeviceDescription() throws JposException {
        return "";
    }
    
    @Override
    public String getPhysicalDeviceName() throws JposException {
        return "";
    }
    
    @Override
    public int getPowerNotify() throws JposException {
        return 0;
    }
    
    @Override
    public void setPowerNotify(int powerNotify) throws JposException {
    }
    
    @Override
    public int getPowerState() throws JposException {
        return 0;
    }
    
    @Override
    public String getRecBarCodeRotationList() throws JposException {
        return "";
    }
    
    @Override
    public String getRecBitmapRotationList() throws JposException {
        return "";
    }
    
    @Override
    public int getRecCartridgeState() throws JposException {
        return 0;
    }
    
    @Override
    public int getRecCurrentCartridge() throws JposException {
        return 0;
    }
    
    @Override
    public void setRecCurrentCartridge(int cartridge) throws JposException {
    }
    
    @Override
    public boolean getRecEmpty() throws JposException {
        return true;
    }
    
    @Override
    public boolean getRecLetterQuality() throws JposException {
        return true;
    }
    
    @Override
    public void setRecLetterQuality(boolean recLetterQuality) throws JposException {
    }
    
    @Override
    public int getRecLineChars() throws JposException {
        return 0;
    }
    
    @Override
    public void setRecLineChars(int recLineChars) throws JposException {
    }
    
    @Override
    public String getRecLineCharsList() throws JposException {
        return "";
    }
    
    @Override
    public int getRecLineHeight() throws JposException {
        return 0;
    }
    
    @Override
    public void setRecLineHeight(int recLineHeight) throws JposException {
    }
    
    @Override
    public int getRecLineSpacing() throws JposException {
        return 0;
    }
    
    @Override
    public void setRecLineSpacing(int recLineSpacing) throws JposException {
    }
    
    @Override
    public int getRecLineWidth() throws JposException {
        return 0;
    }
    
    @Override
    public int getRecLinesToPaperCut() throws JposException {
        return 0;
    }
    
    @Override
    public boolean getRecNearEnd() throws JposException {
        return true;
    }
    
    @Override
    public int getRecSidewaysMaxChars() throws JposException {
        return 0;
    }
    
    @Override
    public int getRecSidewaysMaxLines() throws JposException {
        return 0;
    }
    
    @Override
    public int getRotateSpecial() throws JposException {
        return 0;
    }
    
    @Override
    public void setRotateSpecial(int rotateSpecial) throws JposException {
    }
    
    @Override
    public String getSlpBarCodeRotationList() throws JposException {
        return "";
    }
    
    @Override
    public String getSlpBitmapRotationList() throws JposException {
        return "";
    }
    
    @Override
    public int getSlpCartridgeState() throws JposException {
        return 0;
    }
    
    @Override
    public int getSlpCurrentCartridge() throws JposException {
        return 0;
    }
    
    @Override
    public void setSlpCurrentCartridge(int cartridge) throws JposException {
    }
    
    @Override
    public boolean getSlpEmpty() throws JposException {
        return true;
    }
    
    @Override
    public boolean getSlpLetterQuality() throws JposException {
        return true;
    }
    
    @Override
    public void setSlpLetterQuality(boolean recLetterQuality) throws JposException {
    }
    
    @Override
    public int getSlpLineChars() throws JposException {
        return 0;
    }
    
    @Override
    public void setSlpLineChars(int recLineChars) throws JposException {
    }
    
    @Override
    public String getSlpLineCharsList() throws JposException {
        return "";
    }
    
    @Override
    public int getSlpLineHeight() throws JposException {
        return 0;
    }
    
    @Override
    public void setSlpLineHeight(int recLineHeight) throws JposException {
    }
    
    @Override
    public int getSlpLineSpacing() throws JposException {
        return 0;
    }
    
    @Override
    public void setSlpLineSpacing(int recLineSpacing) throws JposException {
    }
    
    @Override
    public int getSlpLineWidth() throws JposException {
        return 0;
    }
    
    @Override
    public int getSlpLinesNearEndToEnd() throws JposException {
        return 0;
    }
    
    @Override
    public int getSlpMaxLines() throws JposException {
        return 0;
    }
    
    @Override
    public boolean getSlpNearEnd() throws JposException {
        return true;
    }
    
    @Override
    public int getSlpPrintSide() throws JposException {
        return 0;
    }
    
    @Override
    public int getSlpSidewaysMaxChars() throws JposException {
        return 0;
    }
    
    @Override
    public int getSlpSidewaysMaxLines() throws JposException {
        return 0;
    }
    
    @Override
    public void beginInsertion(int timeout) throws JposException 
    {
    }
    
    @Override
    public void beginRemoval(int timeout) throws JposException 
    {
    }
    
    @Override
    public void changePrintSide(int side) throws JposException 
    {
    }
    
    @Override
    public void checkHealth(int level) throws JposException 
    {
    }
    
    @Override
    public void claim(int timeout) throws JposException 
    {
    }
    
    @Override
    public void clearOutput() throws JposException 
    {
    }
    
    @Override
    public void clearPrintArea() throws JposException 
    {
    }
    
    @Override
    public void close() throws JposException 
    {
    }
    
    @Override
    public void compareFirmwareVersion(String firmwareFileName, int[] result) throws JposException 
    {
    }
    
    @Override
    public void cutPaper(int percentage) throws JposException 
    {
    }
    
    @Override
    public void endInsertion() throws JposException 
    {
    }
    
    @Override
    public void endRemoval() throws JposException 
    {
    }
    
    @Override
    public void markFeed(int type) throws JposException 
    {
    }
    
    @Override
    public void pageModePrint(int control) throws JposException 
    {
    }
    
    @Override
    public void printBarCode(int station, String data, int symbology, int height, int width, int alignment, int textPosition) throws JposException 
    {
    }
    
    @Override
    public void printBitmap(int station, String fileName, int width, int alignment) throws JposException 
    {
    }
    
    @Override
    public void printImmediate(int station, String data) throws JposException 
    {
    }
    
    @Override
    public void printMemoryBitmap(int station, byte[] data, int type, int width, int alignment) throws JposException 
    {
    }
    
    @Override
    public void printNormal(int station, String data) throws JposException 
    {
    }
    
    @Override
    public void printTwoNormal(int stations, String data1, String data2) throws JposException 
    {
    }
    
    @Override
    public void release() throws JposException 
    {
    }
    
    @Override
    public void resetStatistics(String statisticsBuffer) throws JposException 
    {
    }
    
    @Override
    public void retrieveStatistics(String[] statisticsBuffer) throws JposException 
    {
    }
    
    @Override
    public void rotatePrint(int station, int rotation) throws JposException 
    {
    }
    
    @Override
    public void setBitmap(int bitmapNumber, int station, String fileName, int width, int alignment) throws JposException 
    {
    }
    
    @Override
    public void setLogo(int location, String data) throws JposException 
    {
    }
    
    @Override
    public void transactionPrint(int station, int control) throws JposException 
    {
    }
    
    @Override
    public void updateFirmware(String firmwareFileName) throws JposException 
    {
    }
    
    @Override
    public void updateStatistics(String statisticsBuffer) throws JposException 
    {
    }
    
    @Override
    public void validateData(int station, String data) throws JposException 
    {
    }
}
