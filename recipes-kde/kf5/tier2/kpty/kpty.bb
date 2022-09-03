SUMMARY = "Pty abstraction"
LICENSE = "GPL-2.0-only & LGPL-2.0-or-later"
LIC_FILES_CHKSUM = " \
    file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
"

inherit kde-kf5 gettext

DEPENDS += " \
    kcoreaddons-native \
    kcoreaddons \
    ki18n \
"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "87c5a63d9d2984fa9ab439d89e5d6f51744185a3e3f5e33b5d84cc18e8280ac4"

EXTRA_OECMAKE += "-DUTEMPTER_EXECUTABLE=${libexecdir}/utempter/utempter"

RDEPENDS:${PN} += "libutempter"
