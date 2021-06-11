SUMMARY = "Plasma-specific protocols for Wayland"
LICENSE = "BSD-3-Clause & LGPL-2.1-only & LGPL-2.1-or-later & LGPL-3.0-only & MIT & MIT-CMU"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=2a4f4fd2128ea2f65047ee63fbca9f68 \
    file://LICENSES/LGPL-3.0-only.txt;md5=c51d3eef3be114124d11349ca0d7e117 \
    file://LICENSES/MIT.txt;md5=38aa75cf4c4c87f018227d5ec9638d75 \
    file://LICENSES/MIT-CMU.txt;md5=b6936b5be2ab721140d9bf57c37b0b92 \
"

inherit kde-base

SRC_URI = "${KDE_MIRROR}/stable/${BPN}/${BP}.tar.xz"
SRC_URI[sha256sum] = "0daa2362f2e0d15f79e0e006e8d7f1908e88e37b5c5208b40c9cb0d4d6dca9b5"
