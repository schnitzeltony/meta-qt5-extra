SUMMARY = "Abstraction to system DNSSD features"
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
"

inherit kde-kf5

DEPENDS += "avahi"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "6f58dcaf51b7188cde16f3b0a9ccf5e7550fe09ca2d9defc3e0ffd4d0fe4bfea"
