SUMMARY = "Support for unit conversion"
LICENSE = "LGPL-2.0+"
LIC_FILES_CHKSUM = " \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
"

inherit kde-kf5 gettext

DEPENDS += "ki18n"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "8c790c9870362032556e3c7d6b37c01bfb571eef32d33a4ac3c96260d8a5439d"
