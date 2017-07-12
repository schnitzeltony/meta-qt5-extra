inherit qemu

DEPENDS += "qemu-native"

# slightly reworked qemu_run_binary: qemu.bbclass expects binary in sysroot but
# our binary is not (yet) installed
# ${@qemu_run_binary_local(d, '$D', '/usr/bin/test_app')} [test_app arguments]
#
def qemu_run_binary_local(data, rootfs_path, binary):
    qemu_binary = qemu_target_binary(data)
    if qemu_binary == "qemu-allarch":
        qemu_binary = "qemuwrapper"

    libdir = rootfs_path + data.getVar("libdir", False)
    base_libdir = rootfs_path + data.getVar("base_libdir", False)
    extra_libdir = data.getVar("QEMU_EXTRA_LIBDIR", False)
    if extra_libdir:
        extra_libdir = ":" + extra_libdir
    else:
        extra_libdir = ""
    qemu_options = data.getVar("QEMU_OPTIONS", True)

    return "PSEUDO_UNLOAD=1 " + qemu_binary + " " + qemu_options + " -L " + rootfs_path\
            + " -E LD_LIBRARY_PATH=" + libdir + ":" + base_libdir + extra_libdir + " "\
            + binary


