package interfaces;


import model.EmailModel;

import java.util.List;

@FunctionalInterface
public interface FilterSpamEmail {

    List<EmailModel> filter();
}
