import com.comphenix.protocol.ProtocolLibrary;
import com.comphenix.protocol.ProtocolManager;
import com.comphenix.protocol.wrappers.EnumWrappers;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin
{

    private static ProtocolManager _protocolManager;

    public void onEnable()
    {
        _protocolManager = ProtocolLibrary.getProtocolManager();
    }

    public void onDisable()
    {

    }

    public static ProtocolManager getProtocolManager()
    {
        return _protocolManager;
    }

}
