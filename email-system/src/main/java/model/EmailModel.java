package model;


import constant.EmailStatus;

import java.time.LocalDateTime;
import java.util.List;

public class EmailModel {
    private String id;
    private String from;
    private List<String> to;
    private List<String> cc;
    private List<String> bcc;
    private List<Attachment> attachments;
    private String subject;
    private String content;
    private EmailStatus status;
    private LocalDateTime sentAt;

    public String getId() {
        return id;
    }

    public EmailStatus getStatus() {
        return status;
    }

    public void setStatus(EmailStatus status) {
        this.status = status;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public List<String> getTo() {
        return to;
    }

    public void setTo(List<String> to) {
        this.to = to;
    }

    public List<String> getCc() {
        return cc;
    }
    public void setCc(List<String> cc) {
        this.cc = cc;
    }

    public List<String> getBcc() {
        return bcc;
    }

    public void setBcc(List<String> bcc) {
        this.bcc = bcc;
    }

    public List<Attachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Attachment> attachments) {
        this.attachments = attachments;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getSentAt() {
        return sentAt;
    }

    public void setSentAt(LocalDateTime sentAt) {
        this.sentAt = sentAt;
    }

    public EmailModel(String subject, String content) {

        this.subject = subject;
        this.content = content;
    }

    public EmailModel() {
    }

    @Override
    public String toString() {
        return "EmailModel{" +
                "subject='" + subject + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
