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
import jpos.loader.JposServiceInstance;
import jpos.services.EventCallbacks;

/**
 * JavaPOS Device Service class, intended to be used for testing purposes in POSPrinterTest.
 *
 */
public final class POSPrinterTestServiceAlwaysThrowingNPE implements jpos.services.POSPrinterService114, JposServiceInstance {
    
    @Override
    public int getDeviceServiceVersion() throws JposException {
        return 1014000;
    }
    
    @Override
    public int getState() throws JposException {
        return JposConst.JPOS_S_CLOSED;
    }

    @Override
    public void open(String logicalName, EventCallbacks cb) throws JposException {
        // intentionally left empty
    }

    @Override
    public void deleteInstance() throws JposException {
        // intentionally left empty
    }

    
    @Override
    public boolean getAsyncMode() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setAsyncMode(boolean asyncMode) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getCapCharacterSet() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapCompareFirmwareVersion() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapConcurrentJrnRec() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapConcurrentJrnSlp() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapConcurrentPageMode() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapConcurrentRecSlp() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapCoverSensor() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapJrn2Color() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapJrnBold() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getCapJrnCartridgeSensor() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getCapJrnColor() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapJrnDhigh() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapJrnDwide() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapJrnDwideDhigh() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapJrnEmptySensor() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapJrnItalic() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapJrnNearEndSensor() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapJrnPresent() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapJrnUnderline() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapMapCharacterSet() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getCapPowerReporting() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapRec2Color() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapRecBarCode() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapRecBitmap() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapRecBold() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getCapRecCartridgeSensor() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getCapRecColor() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapRecDhigh() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapRecDwide() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapRecDwideDhigh() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapRecEmptySensor() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapRecItalic() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapRecLeft90() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getCapRecMarkFeed() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapRecNearEndSensor() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapRecPageMode() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapRecPapercut() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapRecPresent() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapRecRight90() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapRecRotate180() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getCapRecRuledLine() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapRecStamp() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapRecUnderline() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapSlp2Color() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapSlpBarCode() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapSlpBitmap() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapSlpBold() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapSlpBothSidesPrint() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getCapSlpCartridgeSensor() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getCapSlpColor() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapSlpDhigh() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapSlpDwide() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapSlpDwideDhigh() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapSlpEmptySensor() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapSlpFullslip() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapSlpItalic() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapSlpLeft90() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapSlpNearEndSensor() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapSlpPageMode() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapSlpPresent() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapSlpRight90() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapSlpRotate180() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getCapSlpRuledLine() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapSlpUnderline() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapStatisticsReporting() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapTransaction() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapUpdateFirmware() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapUpdateStatistics() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getCartridgeNotify() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setCartridgeNotify(int notify) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getCharacterSet() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setCharacterSet(int characterSet) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getCharacterSetList() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getCheckHealthText() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getClaimed() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCoverOpen() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getDeviceEnabled() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setDeviceEnabled(boolean deviceEnabled) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getDeviceServiceDescription() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getErrorLevel() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getErrorStation() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getErrorString() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getFlagWhenIdle() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setFlagWhenIdle(boolean flagWhenIdle) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getFontTypefaceList() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getFreezeEvents() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setFreezeEvents(boolean freezeEvents) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getJrnCartridgeState() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getJrnCurrentCartridge() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setJrnCurrentCartridge(int cartridge) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getJrnEmpty() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getJrnLetterQuality() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setJrnLetterQuality(boolean jrnLetterQuality) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getJrnLineChars() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setJrnLineChars(int jrnLineChars) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getJrnLineCharsList() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getJrnLineHeight() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setJrnLineHeight(int jrnLineHeight) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getJrnLineSpacing() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setJrnLineSpacing(int jrnLineSpacing) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getJrnLineWidth() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getJrnNearEnd() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getMapCharacterSet() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setMapCharacterSet(boolean mapCharacterSet) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getMapMode() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setMapMode(int mapMode) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getOutputID() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getPageModeArea() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getPageModeDescriptor() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getPageModeHorizontalPosition() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setPageModeHorizontalPosition(int position) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getPageModePrintArea() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setPageModePrintArea(String area) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getPageModePrintDirection() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setPageModePrintDirection(int direction) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getPageModeStation() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setPageModeStation(int station) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getPageModeVerticalPosition() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setPageModeVerticalPosition(int position) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getPhysicalDeviceDescription() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getPhysicalDeviceName() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getPowerNotify() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setPowerNotify(int powerNotify) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getPowerState() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getRecBarCodeRotationList() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getRecBitmapRotationList() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getRecCartridgeState() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getRecCurrentCartridge() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setRecCurrentCartridge(int cartridge) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getRecEmpty() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getRecLetterQuality() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setRecLetterQuality(boolean recLetterQuality) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getRecLineChars() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setRecLineChars(int recLineChars) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getRecLineCharsList() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getRecLineHeight() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setRecLineHeight(int recLineHeight) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getRecLineSpacing() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setRecLineSpacing(int recLineSpacing) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getRecLineWidth() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getRecLinesToPaperCut() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getRecNearEnd() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getRecSidewaysMaxChars() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getRecSidewaysMaxLines() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getRotateSpecial() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setRotateSpecial(int rotateSpecial) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getSlpBarCodeRotationList() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getSlpBitmapRotationList() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getSlpCartridgeState() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getSlpCurrentCartridge() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setSlpCurrentCartridge(int cartridge) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getSlpEmpty() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getSlpLetterQuality() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setSlpLetterQuality(boolean recLetterQuality) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getSlpLineChars() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setSlpLineChars(int recLineChars) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getSlpLineCharsList() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getSlpLineHeight() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setSlpLineHeight(int recLineHeight) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getSlpLineSpacing() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setSlpLineSpacing(int recLineSpacing) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getSlpLineWidth() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getSlpLinesNearEndToEnd() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getSlpMaxLines() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getSlpNearEnd() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getSlpPrintSide() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getSlpSidewaysMaxChars() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getSlpSidewaysMaxLines() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void beginInsertion(int timeout) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void beginRemoval(int timeout) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void changePrintSide(int side) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void checkHealth(int level) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void claim(int timeout) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void clearOutput() throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void clearPrintArea() throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void close() throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void compareFirmwareVersion(String firmwareFileName, int[] result) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void cutPaper(int percentage) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void directIO(int command, int[] data, Object object) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void drawRuledLine(int station, String positionList, int lineDirection, int lineWidth, int lineStyle, int lineColor) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void endInsertion() throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void endRemoval() throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void markFeed(int type) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void pageModePrint(int control) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void printBarCode(int station, String data, int symbology, int height, int width, int alignment, int textPosition) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void printBitmap(int station, String fileName, int width, int alignment) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void printImmediate(int station, String data) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void printMemoryBitmap(int station, byte[] data, int type, int width, int alignment) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void printNormal(int station, String data) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void printTwoNormal(int stations, String data1, String data2) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void release() throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void resetStatistics(String statisticsBuffer) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void retrieveStatistics(String[] statisticsBuffer) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void rotatePrint(int station, int rotation) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void setBitmap(int bitmapNumber, int station, String fileName, int width, int alignment) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void setLogo(int location, String data) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void transactionPrint(int station, int control) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void updateFirmware(String firmwareFileName) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void updateStatistics(String statisticsBuffer) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void validateData(int station, String data) throws JposException 
    {
        throw new NullPointerException();
    }
}
