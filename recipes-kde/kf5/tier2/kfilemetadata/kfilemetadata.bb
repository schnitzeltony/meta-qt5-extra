SUMMARY = "A file metadata and text extraction library"
LICENSE = "BSD-3-Clause & LGPLv2.1 & LGPLv2.1+ & LGPLv3"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=2a4f4fd2128ea2f65047ee63fbca9f68 \
    file://LICENSES/LGPL-3.0-only.txt;md5=c51d3eef3be114124d11349ca0d7e117 \
"

inherit kde-kf5 pkgconfig gettext

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "fa24758c93ce3df9f8ced4310dc0bf58e129b08e50f254daafa025afc9213d68"

# TODO: optionals PACKAGECONFIG (poppler-qt5 / exiv2 / ffmpeg / epub)
DEPENDS += " \
    qtmultimedia \
    lmdb \
    kconfig-native \
    kcoreaddons-native \
    kcoreaddons \
    ki18n \
    karchive \
    libav \
    poppler \
    taglib \
    exiv2 \
"

EXTRA_OECMAKE += "-DBUILD_TESTING=OFF"

FILES_${PN} += "${OE_QMAKE_PATH_PLUGINS}/kf5"

RRECOMMENDS_${PN} += "catdoc"
