package TechSupportRequestHandler;

public class FAQBotHandler implements SupportHandler {
    private SupportHandler next;
    @Override
    public SupportHandler setNext(SupportHandler handler) {
        this.next = handler;
        return handler;
    }

    @Override
    public void handle(String issue) {
        if (issue.equals("password_reset")) {
            System.out.println("[FAQBot] Handled " + issue);
        } else if (next != null) {
            next.handle(issue);
        } else {
            System.out.println("[FAQBot] Cannot handle " + issue);
        }
    }
}
