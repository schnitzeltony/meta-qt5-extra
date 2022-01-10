SUMMARY = "Support for unit conversion"
LICENSE = "LGPL-2.0+"
LIC_FILES_CHKSUM = " \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
"

inherit kde-kf5 gettext

DEPENDS += "ki18n"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "c3559d89fb43fc12b06f6b67a0c2cec2bce3fcdfb36c265fd5ae468a9a5e3bef"
