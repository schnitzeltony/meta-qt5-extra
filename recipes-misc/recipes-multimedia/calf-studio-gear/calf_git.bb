SUMMARY = "High quality open source audio plugins for musicians"
HOMEPAGE = "http://calf-studio-gear.org/"
LICENSE = "GPLv2 & LGPLv2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=dcf3c825659e82539645da41a7908589 \
    file://COPYING.GPL;md5=94d55d512a9ba36caa9b7df079bae19f \
"

SRC_URI = " \
    git://github.com/calf-studio-gear/calf.git \
    file://0001-Do-store-calfmakerdf-commandline-for-later-use-in-qe.patch \
"
SRCREV = "82d61aef1207dc74aafde73b6baaa64c23a3aeb3"
S = "${WORKDIR}/git"
PV = "0.0.60+git${SRCPV}"

inherit autotools-brokensep pkgconfig gtk-icon-cache bash-completion qemu-ext

DEPENDS += " \
    gtk+ \
    jack \
    fluidsynth \
    liblo \
    ladspa-sdk \
"

EXTRA_OECONF += "--enable-experimental"

do_configure_prepend() {
    sed -i 's:%QEMUCOMMAND%:${WORKDIR}/QemuCommands:g' `find ${S} -name Makefile.am`
}

QEMU_EXTRA_LIBDIR = "${D}${libdir}/calf"

do_install_prepend() {
    # These are installed by calfmakerdf but that's moved to end of installation
    install -d ${D}${libdir}/lv2
    install -d ${D}${datadir}/calf
}

do_install_append() {
    # build ttl-files must be done in quemu (lv2-ttl-generator-data loads 
    # so-files and calls functions to create ttl-files)
    cat ${WORKDIR}/QemuCommands | while read calfmakerdf_param; do
        ${@qemu_run_binary_local(d, '${STAGING_DIR_TARGET}', '${D}${bindir}/calfmakerdf')} ${calfmakerdf_param}
    done

    chown -R root:root ${D}${libdir}/lv2
    chown root:root ${D}${datadir}/calf/*.xml

    # job is done - not needed on target
    rm ${D}${bindir}/calfmakerdf

}

FILES_${PN} += "${libdir}/lv2"
INSANE_SKIP_${PN} = "dev-so"
