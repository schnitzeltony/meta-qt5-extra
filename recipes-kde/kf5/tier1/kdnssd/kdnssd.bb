SUMMARY = "Abstraction to system DNSSD features"
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
"

inherit kde-kf5

DEPENDS += "avahi"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "28eba2ff83d92bb80eac5bb771d5d5bf40c975d4b26a74d388092b034a964863"
