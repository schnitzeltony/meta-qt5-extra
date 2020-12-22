SUMMARY = "Abstraction to system DNSSD features"
LICENSE = "BSD-3-Clause & LGPL-2.0+"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
"

inherit kde-kf5

DEPENDS += "avahi"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "9a94cce0d9e5557f83bc76ba6055a77867786c87c6ce723c8a66b6f3a3ecfd56"
