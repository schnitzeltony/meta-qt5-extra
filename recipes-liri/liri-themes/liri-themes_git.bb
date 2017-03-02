SUMMARY = "Themes for a uniform look throughout Liri OS"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = " \
	file://LICENSE.GPLv3;md5=d32239bcb673463ab874e80d47fae504 \
"

inherit liri

PV = "0.9.0+git${SRCPV}"

SRCREV = "884d5faa15f53627c3ca2e3f2e5872e7b157ef25"
S = "${WORKDIR}/git"

PACKAGES = " \
    ${PN}-grub \
    ${PN}-plymouth \
    ${PN}-sddm \
"

RDEPENDS_${PN}-plymouth += " \
    plymouth \
    plymouth-set-default-theme \
"
RDEPENDS_${PN}-sddm += " \
    liri-shell \
"

FILES_${PN}-grub += "/boot/grub/themes"
FILES_${PN}-plymouth += "${datadir}/plymouth/themes"
FILES_${PN}-sddm += "${datadir}/sddm/themes"

pkg_postinst_${PN}() {
#!/bin/sh
plymouth-set-default-theme -R lirios
}
