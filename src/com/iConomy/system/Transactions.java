package com.iConomy.system;

import com.iConomy.Constants;

public class Transactions {
    /**
     * Insert a balance transaction change or update.
     *
     * @param data Transaction class
     */
    public void insert(Transaction data) {
        if (!Constants.Nodes.Logging.getBoolean())
            return;
    }

    public class Transaction {
        private long time = 0L;
        private String where;
        private String from;
        private String to;
        private Double fromBalance = 0.0, toBalance = 0.0;
        private Double set = 0.0, gain = 0.0, loss = 0.0;

        public Transaction(String where) {
            this.where = where;
            this.time = System.currentTimeMillis() / 1000;
        }

        public Transaction(String where, String from, String to) {
            this.where = where;
            this.from = from;
            this.to = to;
            this.time = System.currentTimeMillis() / 1000;
        }

        public Transaction(long time, String where, String from, String to, Double fromBalance, Double toBalance, Double set, Double gain, Double loss) {
            this.time = time;
            this.where = where;
            this.from = from;
            this.to = to;
            this.fromBalance = fromBalance;
            this.toBalance = toBalance;
            this.set = set;
            this.gain = gain;
            this.loss = loss;
        }

        public String getFrom() {
            return from;
        }

        public Double getGain() {
            return gain;
        }

        public Double getLoss() {
            return loss;
        }

        public Double getSet() {
            return set;
        }

        public Double getFromBalance() {
            return fromBalance;
        }

        public long getTime() {
            return time;
        }

        public String getTo() {
            return to;
        }

        public Double getToBalance() {
            return toBalance;
        }

        public Transaction setTime(long time) {
            this.time = time;
            return this;
        }

        public String getWhere() {
            return where;
        }

        public Transaction setFrom(String from) {
            this.from = from;
            return this;
        }

        public Transaction setFromBalance(Double fromBalance) {
            this.fromBalance = fromBalance;
            return this;
        }

        public Transaction setGain(Double gain) {
            this.gain = gain;
            return this;
        }

        public Transaction setLoss(Double loss) {
            this.loss = loss;
            return this;
       }

        public Transaction setSet(Double set) {
            this.set = set;
            return this;
        }

        public Transaction setTo(String to) {
            this.to = to;
            return this;
        }

        public Transaction setWhere(String where) {
            this.where = where;
            return this;
        }

        public Transaction setToBalance(Double toBalance) {
            this.toBalance = toBalance;
            return this;
        }
    }
}