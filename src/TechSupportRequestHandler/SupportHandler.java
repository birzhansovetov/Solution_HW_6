package TechSupportRequestHandler;

public interface SupportHandler {
    SupportHandler setNext(SupportHandler handler);
    void handle(String issue);
}
