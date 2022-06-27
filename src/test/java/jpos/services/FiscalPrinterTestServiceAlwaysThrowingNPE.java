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
 * JavaPOS Device Service class, intended to be used for testing purposes in FiscalPrinterTest.
 *
 */
public final class FiscalPrinterTestServiceAlwaysThrowingNPE implements jpos.services.FiscalPrinterService115, JposServiceInstance {
    
    private JposEntry configuration;
    private EventCallbacks callbacks;
    
    @Override
    public int getDeviceServiceVersion() throws JposException {
        if (configuration.hasPropertyWithName("returnVersionTooLarge"))
            return 1016000;
        else if (configuration.hasPropertyWithName("throwingNPEOnGetDSVersion"))
            throw new NullPointerException();
        else
            return 1015000;
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
        throw new NullPointerException();
    }
    
    
    @Override
    public int getActualCurrency() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getAdditionalHeader() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setAdditionalHeader(String additionalHeader) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getAdditionalTrailer() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setAdditionalTrailer(String additionalTrailer) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getAmountDecimalPlace() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getAmountDecimalPlaces() throws JposException {
        throw new NullPointerException();
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
    public boolean getCapAdditionalHeader() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapAdditionalLines() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapAdditionalTrailer() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapAmountAdjustment() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapAmountNotPaid() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapChangeDue() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapCheckTotal() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapCompareFirmwareVersion() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapCoverSensor() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapDoubleWidth() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapDuplicateReceipt() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapEmptyReceiptIsVoidable() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapFiscalReceiptStation() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapFiscalReceiptType() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapFixedOutput() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapHasVatTable() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapIndependentHeader() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapItemList() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapJrnEmptySensor() throws JposException {
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
    public boolean getCapMultiContractor() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapNonFiscalMode() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapOnlyVoidLastItem() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapOrderAdjustmentFirst() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapPackageAdjustment() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapPercentAdjustment() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapPositiveAdjustment() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapPositiveSubtotalAdjustment() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapPostPreLine() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapPowerLossReport() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getCapPowerReporting() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapPredefinedPaymentLines() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapRecEmptySensor() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapRecNearEndSensor() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapRecPresent() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapReceiptNotPaid() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapRemainingFiscalMemory() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapReservedWord() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapSetCurrency() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapSetHeader() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapSetPOSID() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapSetStoreFiscalID() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapSetTrailer() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapSetVatTable() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapSlpEmptySensor() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapSlpFiscalDocument() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapSlpFullSlip() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapSlpNearEndSensor() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapSlpPresent() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapSlpValidation() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapStatisticsReporting() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapSubAmountAdjustment() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapSubPercentAdjustment() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapSubtotal() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapTotalizerType() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapTrainingMode() throws JposException {
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
    public boolean getCapValidateJournal() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapXReport() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getChangeDue() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setChangeDue(String changeDue) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getCheckHealthText() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCheckTotal() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setCheckTotal(boolean checkTotal) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getClaimed() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getContractorId() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setContractorId(int contractorId) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getCountryCode() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCoverOpen() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getDateType() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setDateType(int dateType) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getDayOpened() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getDescriptionLength() throws JposException {
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
    public boolean getDuplicateReceipt() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setDuplicateReceipt(boolean duplicateReceipt) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getErrorLevel() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getErrorOutID() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getErrorState() throws JposException {
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
    public int getFiscalReceiptStation() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setFiscalReceiptStation(int fiscalReceiptStation) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getFiscalReceiptType() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setFiscalReceiptType(int fiscalReceiptType) throws JposException {
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
    public boolean getFreezeEvents() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setFreezeEvents(boolean freezeEvents) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getJrnEmpty() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getJrnNearEnd() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getMessageLength() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getMessageType() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setMessageType(int messageType) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getNumHeaderLines() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getNumTrailerLines() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getNumVatRates() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getOutputID() throws JposException {
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
    public String getPostLine() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setPostLine(String postLine) throws JposException {
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
    public String getPreLine() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setPreLine(String preLine) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getPredefinedPaymentLines() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getPrinterState() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getQuantityDecimalPlaces() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getQuantityLength() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getRecEmpty() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getRecNearEnd() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getRemainingFiscalMemory() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getReservedWord() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getSlipSelection() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setSlipSelection(int slipSelection) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getSlpEmpty() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getSlpNearEnd() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getTotalizerType() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setTotalizerType(int totalizerType) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getTrainingModeActive() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void beginFiscalDocument(int documentAmount) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void beginFiscalReceipt(boolean printHeader) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void beginFixedOutput(int station, int documentType) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void beginInsertion(int timeout) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void beginItemList(int vatID) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void beginNonFiscal() throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void beginRemoval(int timeout) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void beginTraining() throws JposException 
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
    public void clearError() throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void clearOutput() throws JposException 
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
    public void endFiscalDocument() throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void endFiscalReceipt(boolean printHeader) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void endFixedOutput() throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void endInsertion() throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void endItemList() throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void endNonFiscal() throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void endRemoval() throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void endTraining() throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void getData(int dataItem, int[] optArgs, String[] data) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void getDate(String[] Date) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void getTotalizer(int vatID, int optArgs, String[] data) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void getVatEntry(int vatID, int optArgs, int[] vatRate) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void printDuplicateReceipt() throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void printFiscalDocumentLine(String documentLine) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void printFixedOutput(int documentType, int lineNumber, String data) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void printNormal(int station, String data) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void printPeriodicTotalsReport(String date1, String date2) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void printPowerLossReport() throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void printRecCash(long amount) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void printRecItem(String description, long price, int quantity, int vatInfo, long unitPrice, String unitName) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void printRecItemAdjustment(int adjustmentType, String description, long amount, int vatInfo) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void printRecItemAdjustmentVoid(int adjustmentType, String description, long amount, int vatInfo) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void printRecItemFuel(String description, long price, int quantity, int vatInfo, long unitPrice, String unitName, long specialTax, String specialTaxName) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void printRecItemFuelVoid(String description, long price, int vatInfo, long specialTax) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void printRecItemRefund(String description, long amount, int quantity, int vatInfo, long unitAmount, String unitName) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void printRecItemRefundVoid(String description, long amount, int quantity, int vatInfo, long unitAmount, String unitName) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void printRecItemVoid(String description, long price, int quantity, int vatInfo, long unitPrice, String unitName) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void printRecMessage(String message) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void printRecNotPaid(String description, long amount) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void printRecPackageAdjustVoid(int adjustmentType, String vatAdjustment) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void printRecPackageAdjustment(int adjustmentType, String description, String vatAdjustment) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void printRecRefund(String description, long amount, int vatInfo) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void printRecRefundVoid(String description, long amount, int vatInfo) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void printRecSubtotal(long amount) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void printRecSubtotalAdjustVoid(int adjustmentType, long amount) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void printRecSubtotalAdjustment(int adjustmentType, String description, long amount) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void printRecTaxID(String taxID) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void printRecTotal(long total, long payment, String description) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void printRecVoid(String description) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void printRecVoidItem(String description, long amount, int quantity, int adjustmentType, long adjustment, int vatInfo) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void printReport(int reportType, String startNum, String endNum) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void printXReport() throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void printZReport() throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void release() throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void resetPrinter() throws JposException 
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
    public void setCurrency(int newCurrency) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void setDate(String date) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void setHeaderLine(int lineNumber, String text, boolean doubleWidth) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void setPOSID(String POSID, String cashierID) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void setStoreFiscalID(String ID) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void setTrailerLine(int lineNumber, String text, boolean doubleWidth) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void setVatTable() throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void setVatValue(int vatID, String vatValue) throws JposException 
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
    public void verifyItem(String itemName, int vatID) throws JposException 
    {
        throw new NullPointerException();
    }
}
