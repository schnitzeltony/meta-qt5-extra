SUMMARY = "Support for unit conversion"
LICENSE = "LGPL-2.0+"
LIC_FILES_CHKSUM = " \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
"

inherit kde-kf5 gettext

DEPENDS += "ki18n"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "6e82f0024256c9da5a4892e96f28c19377e4859dceb78333de6ad0a2c6617105"
