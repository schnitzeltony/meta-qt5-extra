SUMMARY = "Monitoring user activity"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & MIT"
LIC_FILES_CHKSUM = " \
    file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=41890f71f740302b785c27661123bff5 \
    file://LICENSES/MIT.txt;md5=38aa75cf4c4c87f018227d5ec9638d75 \
"

inherit kde-kf5

DEPENDS += "${@bb.utils.contains("DISTRO_FEATURES", "x11", "libxcb qtx11extras libxscrnsaver", "", d)}"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "baa36125b6b4b18dbe9004431365635e63f9c9491806ca6560ebb47d7f5962c3"

FILES:${PN} += "${OE_QMAKE_PATH_PLUGINS}"
