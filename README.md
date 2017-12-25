# DeviceInfo

Samples get some android device information.

## Usage

### Device information

```
  import com.github.techrdy.deviceinfo.DeviceInfo;

  DeviceInfo deviceInfo = new DeviceInfo(this);
  // Ram information
  String ramInfo += "\tTotal :" + deviceInfo.getTotalRam() + "\n";
  ramInfo += "\tfree :" + deviceInfo.getFreeRam() + "\n";
  ramInfo += "\tused :" + deviceInfo.getUsedRam()+ "\n";
  // Android version
  String andInfo = "Android Version :" + deviceInfo.getAndroidVersion() + "\n";
  // Device information
  andInfo += "Brand :" + deviceInfo.getBrand() + "\n";
  andInfo += "Device :" + deviceInfo.getDevice() + "\n";
  andInfo += "Model :" + deviceInfo.getModel() + "\n";
  // CPU core information
  String cpu = "CPU Core" + deviceInfo.getProcessorCore() +"";
```

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details
