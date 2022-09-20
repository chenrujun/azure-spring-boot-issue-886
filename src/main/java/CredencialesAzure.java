import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.microsoft.azure.storage.StorageCredentials;
import com.microsoft.azure.storage.StorageCredentialsAccountAndKey;
import com.microsoft.azure.storage.StorageException;

@Component
public class CredencialesAzure  {
	
	@Value("${blob-processed-account-name}")
	private String blobProcessedAccountName;
	@Value("${blob-processed-account-key}")
	private String blobProcessedAccountKey;
	
	@Bean("blobcredentials")
	public StorageCredentials getCredentials() throws StorageException {
		StorageCredentials credenciales = new StorageCredentialsAccountAndKey(blobProcessedAccountName,blobProcessedAccountKey);
		return credenciales;
	}
}
