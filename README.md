# OIB-SIP_ATM
Task 3 of the internship
# Java ATM Simulator

This project is a simple Java-based ATM simulator that allows users to perform essential banking operations, such as balance checking, cash deposits, withdrawals, fund transfers, and viewing transaction history, after PIN validation.

## Features

1. **User Authentication**: Pin-based access to ensure security.
2. **ATM Menu**:
   - **Check Balance**
   - **Deposit Cash**
   - **Withdraw Cash**: 
   - **Transaction History**
   - **Transfer Funds**
   - **Exit**

## Code Structure

- **Main Class (`Atm`)**: Manages the program flow with a PIN check, followed by a looped menu for ATM operations.

- **Key Methods**:
   - `checkBalance()`: Displays the current balance.
   - `depositcash()`: Deposits an amount, updates balance, and logs the transaction.
   - `withdrawcash()`: Withdraws an amount if funds are sufficient, updates balance, and logs the transaction.
   - `transactionHistory()`: Lists all past transactions.
   - `transferFunds()`: Transfers funds to another account, updates balance, and logs the transaction.

This structure provides a modular and clear approach to core ATM functionalities.
