import javax.swing.JOptionPane;


public class MessagesVisitor implements InfoVisitor
{

    @Override
    public void visit(User u) {
        int total = 0;
        for(Object o : u.getUsers())
        {
            User us = (User) o;
            total += us.getTweets().size();
        }
        JOptionPane.showMessageDialog(null, "Total # of messages: " + total);
    }

    @Override
    public void visit(UserGroup ug) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}