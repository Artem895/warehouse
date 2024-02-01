package mainTest;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.assertj.core.api.Assertions.assertThat;

@SpringJUnitConfig
public class FirstForPipeTest {

    @Test
    void firstTest_testPiplineTestJob_success() {
        assertThat("This is first test").isNotEmpty();
    }

    @Test
    void fail_test(){
        assertThat("This is fail test").isEmpty();
    }
}
