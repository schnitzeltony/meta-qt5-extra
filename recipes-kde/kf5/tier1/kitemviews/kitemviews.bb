SUMMARY = "Widget addons for Qt Model/View"
LICENSE = "GPL-2.0-or-later & LGPL-2.0-only & LGPL-2.0-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c \
    file://LICENSES/LGPL-2.0-only.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
"

inherit kde-kf5

DEPENDS += "qttools"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "5b75334b719ce07f4aa33236ef4bd11829504ff381670818ef57a7526938b52e"

FILES:${PN} += "${OE_QMAKE_PATH_PLUGINS}/designer"
