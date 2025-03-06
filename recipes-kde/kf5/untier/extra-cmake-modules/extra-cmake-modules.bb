SUMMARY = "Extra modules and scripts for CMake"
LICENSE = "BSD-2-Clause & BSD-3-Clause & CC0-1.0 & MIT"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-2-Clause.txt;md5=63d6ee386b8aaba70b1bf15a79ca50f2 \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/CC0-1.0.txt;md5=65d3616852dbf7b1a6d4b53b00626032 \
    file://LICENSES/MIT.txt;md5=38aa75cf4c4c87f018227d5ec9638d75 \
"

inherit kde-kf5

DEPENDS = "qttools-native"

SRC_URI[sha256sum] = "8c4c561310db587d390a6c84afc97e1addbaddd73b9d7a4c7309c5da9b9bc8f2"
SRC_URI:append:class-native = " file://0001-ECMGenerateHeaders.cmake-Write-relative-paths-to-red.patch"
PV = "${KF5_VERSION}"

FILES:${PN} += "${datadir}/ECM"

BBCLASSEXTEND = "native"
