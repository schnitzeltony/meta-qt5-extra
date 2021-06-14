SUMMARY = "Baloo provides searching and indexing infrastucture with an emphasis on files"
LICENSE = "BSD-3-Clause & bzip2-1.0.6 & GPL-2.0 & GPL-2.0+ & GPL-3.0 & LGPL-2.0+ & LGPL-2.1 & LGPL-2.1+ & LGPL-3.0"
LIC_FILES_CHKSUM = " \
    file://LICENSES/BSD-3-Clause.txt;md5=954f4d71a37096249f837652a7f586c0 \
    file://LICENSES/bzip2-1.0.6.txt;md5=f1d2fdc6b1d232981a8007aa1854d24d \
    file://LICENSES/GPL-2.0-only.txt;md5=93e64b4a83c7e441e48bbdeeea05c977 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c \
    file://LICENSES/GPL-3.0-only.txt;md5=1c76c4cc354acaac30ed4d5eefea7245 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f \
    file://LICENSES/LGPL-2.1-or-later.txt;md5=2a4f4fd2128ea2f65047ee63fbca9f68 \
    file://LICENSES/LGPL-3.0-only.txt;md5=c51d3eef3be114124d11349ca0d7e117 \
"

inherit kde-kf5 gtk-icon-cache

DEPENDS += " \
    ki18n \
    kconfig \
    kconfig-native \
    kauth-native \
    kidletime \
    kcrash \
    solid \
    kio \
    kdbusaddons \
    kitemmodels \
    kfilemetadata \
    kcoreaddons-native \
    \
    xapian-core \
"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "5aafaa13aa431249bb1479c24cb61952729546a1c27bbc7c60c460a10fd0102a"

SRC_URI += " \
    file://baloo_file.desktop \
"

do_configure_append() {
    # remove absolute paths from exported cmake files
    for f in `find ${B} -name '*Targets*.cmake'`; do
        sed -i 's:${RECIPE_SYSROOT}${prefix}:${_IMPORT_PREFIX}:g' $f
    done
}

do_install_append() {
   install -d ${D}/${sysconfdir}/skel/.config/autostart
   install -m 0644 ${WORKDIR}/baloo_file.desktop ${D}/${sysconfdir}/skel/.config/autostart/
}

PACKAGES =+ "${PN}-no-autostart"

FILES_${PN} += " \
    ${systemd_user_unitdir} \
    ${datadir}/dbus-1 \
    ${datadir}/icons \
    ${datadir}/kservices5 \
    ${OE_QMAKE_PATH_QML}/org/kde/baloo \
    ${OE_QMAKE_PATH_PLUGINS} \
"

FILES_${PN}-no-autostart = "${sysconfdir}/skel/.config/autostart"
