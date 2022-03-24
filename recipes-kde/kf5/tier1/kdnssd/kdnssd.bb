SUMMARY = "Abstraction to system DNSSD features"
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
"

inherit kde-kf5

DEPENDS += "avahi"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "5f36af49faab84d8ae7ec46f1ba3300c9cdd3d8820dd1e7e48c5c37bcdd844d4"
