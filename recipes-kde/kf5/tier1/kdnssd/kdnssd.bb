SUMMARY = "Abstraction to system DNSSD features"
LICENSE = "BSD-3-Clause & LGPL-2.0+"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
"

inherit kde-kf5

DEPENDS += "avahi"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "afa10cdb6cc97413a045e5f152d74e1ef2f0a7bab057460a3d20ab62e098144d"
