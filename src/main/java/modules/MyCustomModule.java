package modules;

import com.qnhant.platform.ModuleRunner;
import org.springframework.stereotype.Service;

@Service
public class MyCustomModule implements ModuleRunner {
    @Override
    public String getIdentifier() {
        return "MY_CUSTOM";
    }

    @Override
    public String getResponse() {
        return "A more interesting response";
    }
}
