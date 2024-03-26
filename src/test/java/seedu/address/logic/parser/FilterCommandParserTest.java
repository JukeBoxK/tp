package seedu.address.logic.parser;

import static seedu.address.logic.Messages.MESSAGE_INVALID_COMMAND_FORMAT;
import static seedu.address.logic.parser.CommandParserTestUtil.assertParseFailure;

import org.junit.jupiter.api.Test;

import seedu.address.logic.commands.FilterCommand;

public class FilterCommandParserTest {

    private FilterCommandParser parser = new FilterCommandParser();

    @Test
    public void parse_emptyArg_throwsParseException() {
        assertParseFailure(parser, "     ", String.format(MESSAGE_INVALID_COMMAND_FORMAT, FilterCommand.MESSAGE_USAGE));
    }

    @Test
    public void parse_validArgs_returnsFindCommand() {
        // TODO: redo this test after Filter Parser is done
        //// no leading and trailing whitespaces
        // FilterCommand expectedFilterCommand =
        //         new FilterCommand(new NameContainsKeywordsPredicate(Arrays.asList("Alice", "Bob")));
        // assertParseSuccess(parser, "Alice Bob", expectedFilterCommand);

        // // multiple whitespaces between keywords
        // assertParseSuccess(parser, " \n Alice \n \t Bob  \t", expectedFilterCommand);
    }

}
