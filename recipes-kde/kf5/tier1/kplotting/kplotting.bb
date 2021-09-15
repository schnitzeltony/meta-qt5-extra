SUMMARY = "Lightweight plotting framework"
LICENSE = "GPL-2.0+ & LGPL-2.0+"
LIC_FILES_CHKSUM = " \
    file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
"

inherit kde-kf5

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "fce4e24d85274565f409451d4ccc25b0d8755e7c63b0eed9b0f5ff6b3351209b"

DEPENDS += "qttools"

FILES:${PN} += "${OE_QMAKE_PATH_PLUGINS}/designer"
