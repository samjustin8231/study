package com.example.codedesign.performancestatistics.ood.viewer;

import com.example.codedesign.performancestatistics.ood.aggregate.EmailSender;
import com.example.codedesign.performancestatistics.ood.RequestStat;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author sunyajun
 * @date 2020/4/28 6:50 下午
 */
public class EmailViewer implements StatViewer {
    private EmailSender emailSender;
    private List<String> toAddresses = new ArrayList<>();

    public EmailViewer() {
        this.emailSender = new EmailSender(/*省略参数*/);
    }

    public EmailViewer(EmailSender emailSender) {
        this.emailSender = emailSender;
    }

    public void addToAddress(String address) {
        toAddresses.add(address);
    }

    public void output(
            Map<String, RequestStat> requestStats, long startTimeInMillis, long endTimeInMills) {
        // format the requestStats to HTML style.
        // send it to email toAddresses.
    }
}
