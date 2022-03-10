SUMMARY = "Support for unit conversion"
LICENSE = "LGPL-2.0-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
"

inherit kde-kf5 gettext

DEPENDS += "ki18n"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "57456b649efe2488f403e7b3cae73a734b3b459d32100b6b143f1c8d80035b58"
