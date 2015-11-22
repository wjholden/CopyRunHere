# CopyRunHere
This program executes commands on a specified list of networked nodes via SSH. This program was designed for network technicians to grab many "show" commands from many Cisco devices in one shot. Only password-based authentication is currently supported, but I think it would be relatively easy to add key-based authentication if anyone wants it.

[CopyRunHere.jar](https://github.com/wjholden/CopyRunHere/blob/master/CopyRunHere.jar?raw=true)

## Demo
[![Screencast](https://j.gifs.com/KdE8wq.gif)](https://www.youtube.com/watch?v=oF86AGFf9ls)

## Dependencies
|                   | License  |  Version  |
| ----------------- |:--------:|:---------:|
| [SSHJ][1]         | Apache 2 |[0.14.0][2]|
| [SLF4J][3]        | MIT      |[1.7.12][4]|
| [BouncyCastle][5] | MIT      |[1.53][6]  |

[1]: https://github.com/hierynomus/sshj
[2]: https://github.com/hierynomus/sshj/archive/v0.14.0.zip

[3]: http://www.slf4j.org/
[4]: http://www.slf4j.org/dist/slf4j-1.7.12.zip

[5]: https://www.bouncycastle.org/
[6]: https://www.bouncycastle.org/download/bcpkix-jdk15on-153.zip
