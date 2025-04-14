package TechSupportRequestHandler;

public class JuniorSupportHandler implements SupportHandler {
    private SupportHandler next;
    @Override
    public SupportHandler setNext(SupportHandler handler) {
        this.next = handler;
        return handler;
    }

    @Override
    public void handle(String issue) {
        if (issue.equals("refund_request") || issue.equals("billing_issue")) {
            System.out.println("[JuniorSupport] Handled " + issue);
        } else if (next != null) {
            next.handle(issue);
        } else {
            System.out.println("[JuniorSupport] Cannot handle " + issue);
        }
    }
}
