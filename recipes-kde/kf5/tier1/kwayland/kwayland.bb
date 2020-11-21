SUMMARY = "KWayland provides a Qt-style Client and Server library wrapper for the Wayland libraries"
LICENSE = "BSD-3-Clause & LGPLv2.1 & LGPLv2.1+ & LGPLv3 & MIT & MIT-CMU"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=2a4f4fd2128ea2f65047ee63fbca9f68 \
    file://LICENSES/LGPL-3.0-only.txt;md5=c51d3eef3be114124d11349ca0d7e117 \
    file://LICENSES/MIT.txt;md5=38aa75cf4c4c87f018227d5ec9638d75 \
    file://LICENSES/MIT-CMU.txt;md5=b6936b5be2ab721140d9bf57c37b0b92 \
"

inherit kde-kf5

DEPENDS += " \
    qtwayland-native \
    qtwayland \
    plasma-wayland-protocols \
"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "eee72a5f57a2f5c6ab5f1717aa3eb5a9089240794a5e40c6d85bdc37fa3027a7"
