SUMMARY = "Lumina Desktop Environment"
HOMEPAGE = "https://lumina-desktop.org/"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=45b10a7bfb52b622b91ca67ea02e4afa"

REQUIRED_DISTRO_FEATURES = "x11"

QT_TRANSLATION_FILES = "${datadir}/*/i18n/*.qm"

inherit qmake5 distro_features_check gtk-icon-cache qt5-translation manpages

DEPENDS += " \
    qttools-native \
    qtbase \
    qtx11extras \
    qtmultimedia \
    qtsvg \
    poppler \
"

SRC_URI = " \
    git://github.com/trueos/lumina.git \
    file://0001-lumina-desktop.pro-fix-out-of-tree-installation.patch \
    file://0002-manpages-fix-out-of-tree-install.patch \
    file://0003-i18n-fix-out-of-tree-build.patch \
"
SRCREV = "a881c51e7b20f086b6b8b546c116d38478f87840"
S = "${WORKDIR}/git"

do_configure_prepend() {
    # change paths by sed instead of endles escapes in 'DEFINES+=..' below
    sed -i 's:L_ETCDIR:QString("${sysconfdir}"):' `find ${S} -name *.cpp`
    sed -i 's:L_SHAREDIR:QString("${datadir}"):' `find ${S} -name *.cpp`
    sed -i 's:$${MAN_ZIP}:gzip -c:' `find ${S} -name *.pro`
}

# Override magic in src-qt5/OS-detect.pri to our paths
EXTRA_QMAKEVARS_PRE += ' \
    OS=Linux \
    PREFIX=${prefix} \
    L_BINDIR=${bindir} \
    L_LIBDIR=${libdir} \
    L_ETCDIR=${sysconfdir} \
    L_SHAREDIR=${datadir} \
    L_INCLUDEDIR=${STAGING_INCDIR} \
    L_SESSDIR=${datadir}/xsessions \
    L_MANDIR=${mandir} \
    LRELEASE=${OE_QMAKE_PATH_EXTERNAL_HOST_BINS}/lrelease \
    CONFIG+=WITH_I18N \
'

PACKAGES =+ "${PN}-icon-themes"

# We have to be very precise for ${datadir}/lumina-desktop otherwise locale
# packages remain empty
FILES_${PN} += " \
    ${datadir}/lthemeengine \
    ${datadir}/lumina-desktop/menu-scripts \
    ${datadir}/lumina-desktop/syntax_rules \
    ${datadir}/lumina-desktop/themes \
    ${datadir}/lumina-desktop/fluxbox* \
    ${datadir}/lumina-desktop/globs2 \
    ${datadir}/lumina-desktop/*.ogg \
    ${datadir}/lumina-desktop/*.conf \
    ${datadir}/lumina-desktop/*.jpg \
    ${datadir}/xsessions \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-icon-themes = "${datadir}/icons"

RRECOMMENDS_${PN} += "${PN}-icon-themes"
