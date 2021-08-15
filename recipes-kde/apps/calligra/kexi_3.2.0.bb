SUMMARY = "Kexi is a visual database applications creator"
HOMEPAGE = "https://www.calligra.org/kexi/"
LICENSE = "GPL-2.0 & LGPL-2.0 & GFDL-1.2 & BSD-3-Clause"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=8608b1f74c58ebcb11718f46e8619749 \
    file://COPYING.LIB;md5=7537f2f34ef162007ae9f34b9f256dcb \
    file://COPYING.DOC;md5=ad1419ecc56e060eccf8184a87c4285f \
    file://COPYING-CMAKE-SCRIPTS;md5=3775480a712fc46a69647678acb234cb \
"

inherit kde-apps gtk-icon-cache mime-xdg

DEPENDS += " \
    qtwebkit \
    \
    kdb \
    kreport \
    \
    kauth-native \
    kconfig-native \
    kcoreaddons-native \
    kdoctools-native \
    karchive \
    kcodecs \
    kconfigwidgets \
    kguiaddons \
    ki18n \
    kiconthemes \
    kitemviews \
    kwidgetsaddons \
    ktextwidgets \
    kxmlgui \
    kcompletion \
    kio \
    ktexteditor \
    marble \
"

SRC_URI = " \
    ${KDE_MIRROR}/stable/${BPN}/src/${BPN}-${PV}.tar.xz \
    file://0001-remove-try_run-by-try_compile-in-breeze-icon-check.patch \
    file://0002-Add-missing-include-to-fix-build-with-Qt-5.11.patch \
    file://0003-Fix-build-with-Qt-5.13.patch \
    file://0004-Set-extern-C-after-including-common-headers.patch \
"
SRC_URI[sha256sum] = "7a813f9ea815a09c1e733d0e7dc879c64eee85f075389e87e6aab99cf0c1c1ff"

do_install:append() {
    install -d "${D}/${datadir}/pixmaps"
    install ${S}/src/pics/icons/breeze/apps/48/kexi.svg ${D}/${datadir}/pixmaps/
}

FILES:${PN} += " \
    ${OE_QMAKE_PATH_PLUGINS} \
"

RDEPENDS:${PN} += "breeze-icons-binres"

# REVISIT
#-- The following RECOMMENDED packages have not been found:
#
# * KexiMarble (required version >= 0.19.2), KDE World Globe Widget library, <https://marble.kde.org>
#   Required by Kexi form map widget
# * MySQL, MySQL Client Library (libmysqlclient), <http://www.mysql.com>
#   Required by Kexi MySQL migration driver
# * PostgreSQL, C API to PostgreSQL (libpq), <http://www.postgresql.org>
#   Required by Kexi PostgreSQL migration driver

